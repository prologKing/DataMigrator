/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.migration;

/**
 *
 * @author Bolaji
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.destination1.entity.ProductAgentsTb;
import com.model.AgentCodeMappingModel;
import com.model.AosAgentsTbModel;
import com.model.AosTeamTbModel;
import com.model.EasyappAgentsTbModel;
import com.model.EasyappTeamTbModel;
import com.model.EazylifeAgentsTbModel;
import com.model.EazylifeTeamTbModel;
import com.model.ProductAgentsModel;
import com.model.TeamIdMappingModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class ProductAgentsTbLogic extends AbstractFacade<ProductAgentsTb> {

    EntityManager em;
    private Query query;

    public ProductAgentsTbLogic() {
        super(ProductAgentsTb.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<ProductAgentsModel> getProductAgentsTb() {
        List<ProductAgentsModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ProductAgentsTb.findAll");
            //query.setParameter("fieldname", fieldname);
//            query = getEM().createNativeQuery(
//                    "SELECT * FROM product_agents_tb", ProductAgentsTb.class
//            );

            List<ProductAgentsTb> branches = query.getResultList();

            branches.forEach((dd) -> {
                ProductAgentsModel dmodel = new ProductAgentsModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public ProductAgentsModel getProductAgentsTbById(String id) {
        ProductAgentsModel dmodel = new ProductAgentsModel();

        try {
            query = getEM().createNamedQuery("ProductAgentsTb.findByPagtCode");
            query.setParameter("pagtCode", id);

            ProductAgentsTb dropdown = (ProductAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductAgentsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public ProductAgentsModel getProductAgentsTbBySysId(int id) {
        ProductAgentsModel dmodel = new ProductAgentsModel();

        try {
            query = getEM().createNamedQuery("ProductAgentsTb.findByPagtSysid");
            query.setParameter("pagtSysid", id);

            ProductAgentsTb dropdown = (ProductAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductAgentsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public ProductAgentsModel getProductAgentsTbMgr(String id) {
        ProductAgentsModel dmodel = new ProductAgentsModel();

        try {
            query = getEM().createNamedQuery("ProductAgentsTb.findByPagtReportMgr");
            query.setParameter("pagtReportMgr", id);

            ProductAgentsTb dropdown = (ProductAgentsTb) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductAgentsModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String getLastSalesManagerID() {
        String staticString = "SM000001";

        try {
            query = this.em.createNativeQuery("SELECT PAGT_CODE From product_agents_tb a WHERE PAGT_CODE like '%SM%' ORDER BY PAGT_CODE DESC LIMIT 1");
            String id = (String) query.setMaxResults(1).getSingleResult();
            int newid = Integer.parseInt(id.substring(2));
            newid++;
            int length = String.valueOf(newid).length();
            staticString = staticString.substring(0, 8 - length) + String.valueOf(newid);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return staticString;
    }

    public String updateReportingID(String code) {
        String result = "There was a problem updating User Login Attempt, please contact support...";

        try {
            getEM().getTransaction().begin();
            query = getEM().createNativeQuery("UPDATE product_agents_tb SET PAGT_REPORT_ID=PAGT_SYSID"
                    + " WHERE PAGT_CODE='" + code + "'");
            query.executeUpdate();

            result = "Reporting ID updated successfully...";
            getEM().getTransaction().commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public ProductAgentsModel checkIfExisting(String fullname, String mobile) {
        ProductAgentsModel dmodel = new ProductAgentsModel();

        try {
            String[] names = fullname.split(" ");
            String[] all = names;
            String condition = "";
            if (fullname != null) {
                for (String name : all) {
                    condition += "(PAGT_SURNAME Like '%" + name + "%' OR PAGT_OTHNAME Like '%" + name + "%') AND ";
                }
            } else {
                condition = "PAGT_REPORT_MGR IS null AND";
            }
            //String qu = mobile == null ? " PAGT_CODE IS NULL " : " PAGT_CODE IS NOT NULL ";

            query = this.em.createNativeQuery("select * FROM product_agents_tb WHERE " + condition + " PAGT_PAL_LEVEL_ID = 2");

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductAgentsModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public ProductAgentsModel getReportName(String fullname) {
        ProductAgentsModel dmodel = new ProductAgentsModel();

        try {
            String[] names = fullname.split(" ");
            String[] all = names;
            String condition = "";
            if (fullname != null) {
                for (String name : all) {
                    condition += "(PAGT_SURNAME Like '%" + name + "%' OR PAGT_OTHNAME Like '%" + name + "%') AND ";
                }
            } else {
                condition = "PAGT_REPORT_MGR IS NULL AND";
            }

            query = this.em.createNativeQuery("select * FROM product_agents_tb WHERE " + condition + " PAGT_SYSID > 0 LIMIT 1");

            Object[] obj = (Object[]) query.setMaxResults(1).getSingleResult();
            dmodel = new ProductAgentsModel(obj);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String saveAosTeamLeaders(AosTeamTbModel dmodel) {
        String result = "There was a problem saving...";
        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        BranchMappingLogic bmlogic = new BranchMappingLogic();
        TeamIdMappingLogic tmLogic = new TeamIdMappingLogic();
        AosTeamTbLogic aoslogic = new AosTeamTbLogic();
        ProductAgentsModel pagmodel = null;

        try {
            ProductAgentsModel pamodel = new ProductAgentsModel(dmodel);
            ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(pamodel.getPagtReportMgr(), pamodel.getPagtMobile());
            pamodel.setPagtCode(this.getLastSalesManagerID());
            int branch = bmlogic.getBranchMappingById(pamodel.getProductAgentsTbPK().getPagtBranchSysid()).getV2Id();
            pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
            pamodel.setPagtSubbranchSysid(branch);
            ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
            if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                getEM().getTransaction().begin();
            }

            if (pamodel.getProductAgentsTbPK().getPagtSysid() == 0) {
                if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                    create(pagent);

                    result = "Agent created successfully...";
                    getEM().getTransaction().commit();
                    ptbLogic.updateReportingID(pamodel.getPagtCode());
                    pagmodel = ptbLogic.getProductAgentsTbById(pamodel.getPagtCode());
                } else {
                    result = "Agent record already added successfully...";
                }
                TeamIdMappingModel tmodel = tmLogic.getTeamIdMappingById(dmodel.getTeamId());
                if (tmodel.getV2teamId() == 0) {
                    AosTeamTbModel aosteam = aoslogic.getAosTeamTbById(dmodel.getTeamId());
                    ProductAgentsModel agent = ptbLogic.getReportName(aosteam.getTeamName());
                    tmodel.setV2teamId(agent.getPagtReportId());
                }
                tmLogic.saveTeamIdMapping(new TeamIdMappingModel(tmodel.getId(), dmodel.getTeamId(), pagmodel == null ? tmodel.getV2teamId() : pagmodel.getPagtReportId()));
            } else {
                edit(pagent);
                result = "Agent updated successfully...";
                getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String saveAosAgents(AosAgentsTbModel dmodel) {
        String result = "There was a problem saving...";
        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        BranchMappingLogic bmlogic = new BranchMappingLogic();
        TeamIdMappingLogic tmLogic = new TeamIdMappingLogic();
        AosTeamTbLogic aosLogic = new AosTeamTbLogic();
        AgentCodeMappingLogic acmlogic = new AgentCodeMappingLogic();

        try {
            String id = dmodel.getAgentsTeamId();
            ProductAgentsModel pamodel = new ProductAgentsModel(dmodel);
            ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(pamodel.getPagtReportMgr(), pamodel.getPagtMobile());
            TeamIdMappingModel tmodel = tmLogic.getTeamIdMappingById(id);
            if (tmodel.getV1teamId() == null) {
                ProductAgentsModel pmodel2 = ptbLogic.getReportName(pamodel.getPagtReportMgr());
                if (pmodel2.getPagtReportId() != 0) {
                    pamodel.setPagtReportId(pmodel2.getPagtReportId());
                    pamodel.setPagtReportMgr(pmodel2.getPagtReportMgr());
                } else {
                }
            } else {
                pamodel.setPagtReportId(tmodel.getV2teamId());
                pamodel.setPagtReportMgr(aosLogic.getAosTeamTbById(id).getTeamName().toUpperCase());
            }
            int branch = bmlogic.getBranchMappingById(pamodel.getProductAgentsTbPK().getPagtBranchSysid()).getV2Id();
            pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
            pamodel.setPagtSubbranchSysid(branch);
            ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
            if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                getEM().getTransaction().begin();
            }

            if (pamodel.getProductAgentsTbPK().getPagtSysid() == 0) {
                if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                    create(pagent);

                    result = "Agent created successfully...";
                    pamodel2.setPagtCode(pamodel.getPagtCode());
                    getEM().getTransaction().commit();

                } else {
                    result = "Agent record already added successfully...";
                }
                AgentCodeMappingModel mapmodel = new AgentCodeMappingModel();
                mapmodel.setStoredCode(pamodel2.getPagtCode());
                List<AgentCodeMappingModel> acmlist = acmlogic.getAgentCodeMappingById(pamodel2.getPagtCode());
                boolean isFound = false;
                for (AgentCodeMappingModel acmmodel : acmlist) {
                    if (dmodel.getAgentsId().equals(acmmodel.getOtherCode())) {
                        isFound = true;
                        mapmodel = acmmodel;
                    }
                }
                if (!isFound && !dmodel.getAgentsId().equals(mapmodel.getStoredCode())) {
                    acmlogic.saveAgentMapping(new AgentCodeMappingModel(mapmodel.getId(), mapmodel.getStoredCode(), dmodel.getAgentsId()));
                }

            } else {
                edit(pagent);
                result = "Agent updated successfully...";
                getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public int getDestinationBranch(String branchcode) {
        Map<String, String> map = new HashMap<>();
        map.put("41", "41");
        map.put("42", "42");
        map.put("43", "43");
        map.put("44", "44");
        map.put("45", "45");
        map.put("46", "46");
        map.put("47", "47");
        map.put("48", "48");
        map.put("50", "50");
        map.put("51", "51");
        map.put("52", "52");
        map.put("53", "86");
        map.put("54", "88");
        map.put("55", "90");
        map.put("56", "47");
        map.put("57", "47");
        map.put("58", "47");
        map.put("59", "47");
        map.put("60", "91");
        map.put("61", "92");
        return Integer.parseInt(map.containsKey(branchcode) ? map.get(branchcode) : "94");

    }

    public String getManager(String branchcode) {
        Map<String, String> map = new HashMap<>();
        map.put("A310000000031", "bimpong eric");
        map.put("A320000000001", "ABDUL RAZAK ABBAN");
        map.put("B410000000001", "Richard Rasheed Adeola");
        map.put("B410000000009", "Richard Rasheed Adeola");
        map.put("B420000000004", "ROGER BOTCHWAY");
        map.put("B420000000016", "Amedior Doris");
        map.put("B420000000028", "ROGER BOTCHWAY");
        map.put("B430000000020", "ROGER BOTCHWAY");
        map.put("B440000000002", "ROGER BOTCHWAY");
        map.put("B440000000020", "Richard Rasheed Adeola");
        map.put("B510000000001", "LAMPTEY SETH ODARTEY");
        map.put("B510000000002", "LAMPTEY SETH ODARTEY");
        map.put("B510000000003", "ADDISON-BENTSI GLORIA");
        map.put("B510000000004", "LAMPTEY SETH ODARTEY");
        map.put("B510000000005", "LAMPTEY SETH ODARTEY");
        map.put("B510000000006", "LAMPTEY SETH ODARTEY");
        map.put("B510000000007", "LAMPTEY SETH ODARTEY");
        map.put("B510000000008", "LAMPTEY SETH ODARTEY");
        map.put("B510000000009", "LAMPTEY SETH ODARTEY");
        map.put("B510000000010", "LAMPTEY SETH ODARTEY");
        map.put("B510000000011", "LAMPTEY SETH ODARTEY");
        map.put("B510000000012", "LAMPTEY SETH ODARTEY");
        map.put("B510000000013", "LAMPTEY SETH ODARTEY");
        map.put("B510000000014", "LAMPTEY SETH ODARTEY");
        map.put("B510000000015", "LAMPTEY SETH ODARTEY");
        map.put("B510000000016", "LAMPTEY SETH ODARTEY");
        map.put("B510000000017", "LAMPTEY SETH ODARTEY");
        map.put("B510000000018", "LAMPTEY SETH ODARTEY");
        map.put("B510000000019", "LAMPTEY SETH ODARTEY");
        map.put("B510000000020", "LAMPTEY SETH ODARTEY");
        map.put("B510000000021", "LAMPTEY SETH ODARTEY");
        map.put("B510000000022", "LAMPTEY SETH ODARTEY");
        map.put("B510000000023", "LAMPTEY SETH ODARTEY");
        map.put("B510000000024", "LAMPTEY SETH ODARTEY");
        map.put("B510000000025", "LAMPTEY SETH ODARTEY");
        map.put("B510000000026", "LAMPTEY SETH ODARTEY");
        map.put("B520000000016", "Richard Rasheed Adeola");
        map.put("B520000000017", "Richard Rasheed Adeola");
        map.put("B530000000005", "LAMPTEY SETH ODARTEY");
        map.put("B530000000007", "LAMPTEY SETH ODARTEY");
        map.put("B530000000017", "LAMPTEY SETH ODARTEY");
        map.put("B530000000018", "Richard Rasheed Adeola");
        map.put("B530000000027", "LAMPTEY SETH ODARTEY");
        map.put("B530000000030", "LAMPTEY SETH ODARTEY");
        map.put("B530000000031", "LAMPTEY SETH ODARTEY");
        map.put("B530000000033", "LAMPTEY SETH ODARTEY");
        map.put("B530000000034", "Richard Rasheed Adeola");
        map.put("B530000000036", "LAMPTEY SETH ODARTEY");
        map.put("B610000000002", "AMOS APAU AKROFI");
        map.put("B610000000007", "AMOS APAU AKROFI");
        map.put("B610000000012", "AMOS APAU AKROFI");
        map.put("B610000000015", "AMOS APAU AKROFI");
        map.put("B610000000016", "AMOS APAU AKROFI");
        map.put("B610000000027", "AMOS APAU AKROFI");
        map.put("B610000000028", "AMOS APAU AKROFI");
        map.put("B610000000029", "AMOS APAU AKROFI");
        map.put("B620000000011", "AMOS APAU AKROFI");
        map.put("B620000000023", "AMOS APAU AKROFI");
        map.put("B620000000024", "AMOS APAU AKROFI");
        map.put("C740000000006", "EBENEZER ODURO");
        map.put("C740000000042", "EBENEZER ODURO");
        map.put("C740000000046", "EBENEZER ODURO");
        map.put("C810000000001", "ELVIS YEBOAH");
        map.put("C810000000003", "ELVIS YEBOAH");
        map.put("C810000000004", "ELVIS YEBOAH");
        map.put("C810000000007", "ELVIS YEBOAH");
        map.put("C810000000008", "ELVIS YEBOAH");
        map.put("C810000000010", "ELVIS YEBOAH");
        map.put("C810000000013", "ELVIS YEBOAH");
        map.put("C810000000015", "ELVIS YEBOAH");
        map.put("C810000000016", "ELVIS YEBOAH");
        map.put("C810000000017", "ELVIS YEBOAH");
        map.put("C810000000020", "ELVIS YEBOAH");
        map.put("C810000000021", "ELVIS YEBOAH");
        map.put("C810000000022", "ELVIS YEBOAH");
        map.put("C810000000024", "ELVIS YEBOAH");
        map.put("C810000000025", "ELVIS YEBOAH");
        map.put("C810000000026", "ELVIS YEBOAH");
        map.put("C810000000027", "ELVIS YEBOAH");
        map.put("C810000000028", "ELVIS YEBOAH");
        map.put("C810000000029", "ELVIS YEBOAH");
        map.put("C810000000030", "ELVIS YEBOAH");
        map.put("C810000000032", "ELVIS YEBOAH");
        map.put("C810000000033", "ELVIS YEBOAH");
        map.put("C810000000034", "ELVIS YEBOAH");
        map.put("C810000000036", "ELVIS YEBOAH");
        map.put("C810000000037", "ELVIS YEBOAH");
        map.put("C810000000038", "ELVIS YEBOAH");
        map.put("C810000000039", "ELVIS YEBOAH");
        map.put("C810000000040", "ELVIS YEBOAH");
        map.put("C810000000041", "ELVIS YEBOAH");
        map.put("C810000000042", "ELVIS YEBOAH");
        map.put("C810000000043", "ELVIS YEBOAH");
        map.put("C810000000044", "ELVIS YEBOAH");
        map.put("C820000000001", "ELVIS YEBOAH");
        map.put("C820000000002", "ELVIS YEBOAH");
        map.put("C820000000004", "ELVIS YEBOAH");
        map.put("C820000000009", "ELVIS YEBOAH");
        map.put("C820000000010", "ELVIS YEBOAH");
        map.put("C820000000014", "ELVIS YEBOAH");
        map.put("C820000000015", "ELVIS YEBOAH");
        map.put("C820000000016", "ELVIS YEBOAH");
        map.put("C820000000018", "ELVIS YEBOAH");
        map.put("C820000000019", "ELVIS YEBOAH");
        map.put("C820000000021", "ELVIS YEBOAH");
        map.put("C820000000022", "ELVIS YEBOAH");
        map.put("C820000000023", "ELVIS YEBOAH");
        map.put("C820000000024", "ELVIS YEBOAH");
        map.put("C820000000025", "ELVIS YEBOAH");
        map.put("C820000000026", "ELVIS YEBOAH");
        map.put("C820000000028", "ELVIS YEBOAH");
        map.put("C820000000029", "ELVIS YEBOAH");
        map.put("C820000000030", "ELVIS YEBOAH");
        map.put("C820000000031", "ELVIS YEBOAH");
        map.put("C820000000032", "ELVIS YEBOAH");
        map.put("C820000000033", "ELVIS YEBOAH");
        map.put("C820000000034", "ELVIS YEBOAH");
        map.put("C820000000035", "ELVIS YEBOAH");
        map.put("C820000000036", "ELVIS YEBOAH");
        map.put("C830000000001", "ELVIS YEBOAH");
        map.put("C830000000002", "ELVIS YEBOAH");
        map.put("C830000000003", "ELVIS YEBOAH");
        map.put("C830000000004", "ELVIS YEBOAH");
        map.put("C830000000006", "ELVIS YEBOAH");
        map.put("C830000000007", "ELVIS YEBOAH");
        map.put("C830000000008", "ELVIS YEBOAH");
        map.put("C830000000009", "ELVIS YEBOAH");
        map.put("C830000000011", "ELVIS YEBOAH");
        map.put("C830000000012", "ELVIS YEBOAH");
        map.put("C830000000013", "ELVIS YEBOAH");
        map.put("C830000000014", "ELVIS YEBOAH");
        map.put("C830000000016", "ELVIS YEBOAH");
        map.put("C830000000017", "ELVIS YEBOAH");
        map.put("C830000000018", "ELVIS YEBOAH");
        map.put("C830000000019", "ELVIS YEBOAH");
        map.put("C830000000021", "ELVIS YEBOAH");
        map.put("C830000000024", "ELVIS YEBOAH");
        map.put("C830000000025", "ELVIS YEBOAH");
        map.put("C830000000026", "ELVIS YEBOAH");
        map.put("C830000000027", "ELVIS YEBOAH");
        map.put("C830000000028", "ELVIS YEBOAH");
        map.put("C820000000037", "ELVIS YEBOAH");
        map.put("C810000000046", "ELVIS YEBOAH");
        map.put("C810000000045", "ELVIS YEBOAH");
        map.put("C780000000003", "agyemang nana adwoa konadu");
        map.put("C780000000002", "agyemang nana adwoa konadu");
        map.put("C780000000001", "agyemang nana adwoa konadu");
        map.put("B620000000025", "AMOS APAU AKROFI");
        map.put("B610000000030", "AMOS APAU AKROFI");
        map.put("B530000000038", "LAMPTEY SETH ODARTEY");
        map.put("B530000000037", "LAMPTEY SETH ODARTEY");
        map.put("B510000000027", "LAMPTEY SETH ODARTEY");
        map.put("B450000000005", "ROGER BOTCHWAY");
        map.put("B450000000004", "ROGER BOTCHWAY");
        map.put("B450000000003", "ROGER BOTCHWAY");
        map.put("C831960013", "ELVIS YEBOAH");
        map.put("B611960014", "AMOS APAU AKROFI");
        map.put("B511960017", "LAMPTEY SETH ODARTEY");
        map.put("B511960018", "LAMPTEY SETH ODARTEY");
        map.put("B511960021", "LAMPTEY SETH ODARTEY");
        map.put("C841970001", "ELVIS YEBOAH");
        map.put("B631970004", "AMOS APAU AKROFI");
        map.put("B631970005", "AMOS APAU AKROFI");
        map.put("B631970006", "AMOS APAU AKROFI");
        map.put("B511970007", "LAMPTEY SETH ODARTEY");
        map.put("C781970020", "agyemang nana adwoa konadu");
        map.put("B511970022", "LAMPTEY SETH ODARTEY");
        map.put("C781970027", "agyemang nana adwoa konadu");
        map.put("B451970045", "ROGER BOTCHWAY");
        map.put("C781970050", "agyemang nana adwoa konadu");
        map.put("C841970055", "ELVIS YEBOAH");
        map.put("C841970056", "ELVIS YEBOAH");
        map.put("A251970063", "ROGER BOTCHWAY");
        map.put("A251970065", "ROGER BOTCHWAY");
        map.put("C841970074", "ELVIS YEBOAH");
        map.put("B451980011", "ROGER BOTCHWAY");
        map.put("C781980016", "agyemang nana adwoa konadu");
        map.put("C781980021", "agyemang nana adwoa konadu");
        map.put("B631980028", "AMOS APAU AKROFI");
        map.put("B631980029", "AMOS APAU AKROFI");
        map.put("B631980030", "AMOS APAU AKROFI");
        map.put("C841980037", "ELVIS YEBOAH");
        map.put("C841980038", "ELVIS YEBOAH");
        map.put("C781990017", "agyemang nana adwoa konadu");
        map.put("A251990021", "ROGER BOTCHWAY");
        map.put("A251990022", "ROGER BOTCHWAY");
        map.put("B6319100004", "AMOS APAU AKROFI");
        map.put("B6319100005", "AMOS APAU AKROFI");
        map.put("B6319100006", "AMOS APAU AKROFI");
        map.put("B6319100007", "AMOS APAU AKROFI");
        map.put("B5119100020", "LAMPTEY SETH ODARTEY");
        map.put("B5119100021", "LAMPTEY SETH ODARTEY");
        map.put("C7819100024", "agyemang nana adwoa konadu");
        map.put("C8419100039", "ELVIS YEBOAH");
        map.put("C8419100040", "ELVIS YEBOAH");
        map.put("A1319100044", "Amedior Doris");
        map.put("C7819110004", "agyemang nana adwoa konadu");
        map.put("B6319110011", "AMOS APAU AKROFI");
        map.put("B6319110012", "AMOS APAU AKROFI");
        map.put("B6319110013", "AMOS APAU AKROFI");
        map.put("B6319110014", "AMOS APAU AKROFI");
        map.put("C8419110015", "ELVIS YEBOAH");
        map.put("B4519110021", "ROGER BOTCHWAY");
        map.put("C7819110030", "agyemang nana adwoa konadu");
        map.put("A3119110039", "bimpong eric");
        map.put("B5119120003", "ADDISON-BENTSI GLORIA");
        map.put("C8419120004", "ELVIS YEBOAH");
        map.put("C8419120005", "ELVIS YEBOAH");
        map.put("C8419120006", "ELVIS YEBOAH");
        map.put("C8419120007", "ELVIS YEBOAH");
        map.put("A3219120012", "bimpong eric");
        map.put("C7419120022", "EBENEZER ODURO");
        map.put("B512010005", "ADDISON-BENTSI GLORIA");
        map.put("A312010022", "bimpong eric");
        map.put("A312010025", "bimpong eric");
        map.put("B452010032", "ROGER BOTCHWAY");
        map.put("B512010033", "LAMPTEY SETH ODARTEY");
        map.put("B512010034", "LAMPTEY SETH ODARTEY");
        map.put("A152020002", "ROGER BOTCHWAY");
        map.put("A132020004", "Amedior Doris");
        map.put("C782020006", "agyemang nana adwoa konadu");
        map.put("C782020010", "agyemang nana adwoa konadu");
        map.put("B632020022", "AMOS APAU AKROFI");
        map.put("B632020023", "AMOS APAU AKROFI");
        map.put("B632020024", "AMOS APAU AKROFI");
        map.put("C7002020035", "EBENEZER ODURO");
        map.put("C842030003", "ELVIS YEBOAH");
        map.put("C842030004", "ELVIS YEBOAH");
        map.put("C842030005", "ELVIS YEBOAH");
        map.put("C742030006", "ELVIS YEBOAH");
        map.put("A152030010", "ROGER BOTCHWAY");
        map.put("A152030019", "ROGER BOTCHWAY");
        map.put("C782030024", "agyemang nana adwoa konadu");
        map.put("A312030032", "ABDUL RAZAK ABBAN");
        map.put("A312030035", "ABDUL RAZAK ABBAN");
        map.put("C842040001", "ELVIS YEBOAH");
        map.put("B512040002", "LAMPTEY SETH ODARTEY");
        map.put("B512040003", "LAMPTEY SETH ODARTEY");
        map.put("A152050005", "ROGER BOTCHWAY");
        map.put("A312050014", "bimpong eric");
        map.put("A132050016", "Amedior Doris");
        map.put("C782050023", "agyemang nana adwoa konadu");
        map.put("C742050026", "EBENEZER ODURO");
        map.put("B422050029", "Amedior Doris");
        map.put("A132060001", "Amedior Doris");
        map.put("A312060002", "bimpong eric");
        map.put("A312060003", "bimpong eric");
        map.put("C842060008", "ELVIS YEBOAH");
        map.put("C842060009", "ELVIS YEBOAH");
        map.put("A132060020", "Amedior Doris");
        map.put("C792060023", "EBENEZER ODURO");
        map.put("A142060033", "Amedior Doris");
        map.put("A142060034", "Amedior Doris");
        map.put("A142060035", "Amedior Doris");
        map.put("A142060036", "Amedior Doris");
        map.put("A152060042", "ROGER BOTCHWAY");
        map.put("A142060044", "Amedior Doris");
        map.put("B512060045", "LAMPTEY SETH ODARTEY");
        map.put("C782060048", "agyemang nana adwoa konadu");
        map.put("C7002060062", "EBENEZER ODURO");
        map.put("A312070004", "ABDUL RAZAK ABBAN");
        map.put("A312070005", "ABDUL RAZAK ABBAN");
        map.put("A152070009", "ROGER BOTCHWAY");
        map.put("B632070012", "AMOS APAU AKROFI");
        map.put("B632070013", "AMOS APAU AKROFI");
        map.put("B632070014", "AMOS APAU AKROFI");
        map.put("B632070015", "AMOS APAU AKROFI");
        map.put("C842070016", "ELVIS YEBOAH");
        map.put("C1582070017", "agyemang nana adwoa konadu");
        map.put("C17002070022", "EBENEZER ODURO");
        map.put("C17002070024", "EBENEZER ODURO");
        map.put("A312070035", "ABDUL RAZAK ABBAN");
        map.put("A312070037", "bimpong eric");
        map.put("A312070038", "bimpong eric");
        map.put("A312070039", "ABDUL RAZAK ABBAN");
        map.put("A312070043", "ABDUL RAZAK ABBAN");
        map.put("B512080001", "ADDISON-BENTSI GLORIA");
        map.put("C842080002", "ELVIS YEBOAH");
        map.put("C842080003", "ELVIS YEBOAH");
        map.put("C842080004", "ELVIS YEBOAH");
        map.put("C842080005", "ELVIS YEBOAH");
        map.put("C842080006", "ELVIS YEBOAH");
        map.put("C842080007", "ELVIS YEBOAH");
        map.put("C842080008", "ELVIS YEBOAH");
        map.put("A142080012", "Amedior Doris");
        map.put("A142080013", "Amedior Doris");
        map.put("A142080016", "Amedior Doris");
        map.put("B632080018", "AMOS APAU AKROFI");
        map.put("B632080019", "AMOS APAU AKROFI");
        map.put("B632080020", "AMOS APAU AKROFI");
        map.put("B632080021", "AMOS APAU AKROFI");
        map.put("B452080025", "ROGER BOTCHWAY");
        map.put("A142080029", "Amedior Doris");
        map.put("A142080032", "Amedior Doris");
        map.put("C1582080041", "agyemang nana adwoa konadu");
        map.put("B452090001", "ROGER BOTCHWAY");
        map.put("B452090003", "ROGER BOTCHWAY");
        map.put("A312090006", "bimpong eric");
        map.put("B512090009", "LAMPTEY SETH ODARTEY");
        map.put("B512090010", "LAMPTEY SETH ODARTEY");
        map.put("B522090012", "Richard Rasheed Adeola");
        map.put("B522090013", "ADDISON-BENTSI GLORIA");
        map.put("B512090014", "LAMPTEY SETH ODARTEY");
        map.put("B452090015", "ROGER BOTCHWAY");
        map.put("A312090019", "ABDUL RAZAK ABBAN");
        map.put("A312090020", "ABDUL RAZAK ABBAN");
        map.put("B452090021", "ROGER BOTCHWAY");
        map.put("C842090022", "ELVIS YEBOAH");
        map.put("B502090032", "Richard Rasheed Adeola");
        map.put("B502090033", "Richard Rasheed Adeola");
        map.put("B502090034", "Richard Rasheed Adeola");
        map.put("C15002090050", "EBENEZER ODURO");
        map.put("C1582090052", "agyemang nana adwoa konadu");
        map.put("A1020100001", "Richard Rasheed Adeola");
        map.put("A1020100002", "Richard Rasheed Adeola");
        map.put("B6020100011", "Prince Mawuena");
        map.put("B6020100012", "Prince Mawuena");
        map.put("B6020100013", "Prince Mawuena");
        map.put("B6020100014", "Prince Mawuena");
        map.put("B6020100015", "Prince Mawuena");
        map.put("C8420100016", "ELVIS YEBOAH");
        map.put("B6320100017", "AMOS APAU AKROFI");
        map.put("B6320100019", "AMOS APAU AKROFI");
        map.put("B6020100020", "Miriam Naa Adotey");
        map.put("B6020100021", "Miriam Naa Adotey");
        map.put("B6020100022", "Miriam Naa Adotey");
        map.put("B6020100023", "Miriam Naa Adotey");
        map.put("B6020100024", "Anthony Okrah Dwumah");
        map.put("B6020100025", "Anthony Okrah Dwumah");
        map.put("B6020100026", "Anthony Okrah Dwumah");
        map.put("B6020100027", "Anthony Okrah Dwumah");
        map.put("B6020100028", "Anthony Okrah Dwumah");
        map.put("B6020100029", "Anthony Okrah Dwumah");
        map.put("A3120100039", "bimpong eric");
        map.put("B6020100074", "Prince Mawuena");
        map.put("B6020100075", "Miriam Naa Adotey");
        map.put("C8420100076", "ELVIS YEBOAH");
        map.put("C8420100077", "ELVIS YEBOAH");
        map.put("A3120100100", "bimpong eric");
        map.put("A3120100101", "bimpong eric");
        map.put("B5020100127", "Richard Rasheed Adeola");
        map.put("B5020100128", "Richard Rasheed Adeola");
        map.put("B4420100131", "Amedior Doris");
        map.put("B4520100133", "ROGER BOTCHWAY");
        map.put("C8420100153", "ELVIS YEBOAH");
        map.put("C8420100154", "ELVIS YEBOAH");
        map.put("B6020100156", "Miriam Naa Adotey");
        map.put("B6020100157", "Miriam Naa Adotey");
        map.put("B6020100158", "Anthony Okrah Dwumah");
        map.put("B6020100159", "Prince Mawuena");
        map.put("B6020100160", "Miriam Naa Adotey");
        map.put("B6020100161", "Miriam Naa Adotey");
        map.put("B6320100162", "AMOS APAU AKROFI");
        map.put("B6020100163", "Prince Mawuena");
        map.put("B6020100164", "Anthony Okrah Dwumah");
        map.put("B4520110009", "ROGER BOTCHWAY");
        map.put("C8420110010", "ELVIS YEBOAH");
        map.put("C8420110013", "ELVIS YEBOAH");
        map.put("C177120110022", "agyemang nana adwoa konadu");
        map.put("C15820110028", "agyemang nana adwoa konadu");
        map.put("C15820110029", "agyemang nana adwoa konadu");
        map.put("C8020110031", "ELVIS YEBOAH");
        map.put("B6320110032", "AMOS APAU AKROFI");
        map.put("B6320110033", "AMOS APAU AKROFI");
        map.put("B6020110034", "Prince Mawuena");
        map.put("B6320110035", "AMOS APAU AKROFI");
        map.put("B6020110036", "Miriam Naa Adotey");
        map.put("B6020110037", "Anthony Okrah Dwumah");
        map.put("B6020110038", "Prince Mawuena");
        map.put("B6020110039", "Prince Mawuena");
        map.put("C15820120005", "agyemang nana adwoa konadu");
        map.put("B5020120013", "Richard Rasheed Adeola");
        map.put("B5020120021", "Richard Rasheed Adeola");
        map.put("B4520120022", "ROGER BOTCHWAY");
        map.put("B5120120025", "LAMPTEY SETH ODARTEY");
        map.put("B51120120026", "ADDISON-BENTSI GLORIA");
        map.put("A3020120027", "ABDUL RAZAK ABBAN");
        map.put("A3120120028", "bimpong eric");
        map.put("A3120120029", "bimpong eric");
        map.put("B5020120053", "Richard Rasheed Adeola");
        map.put("B602110017", "Anthony Okrah Dwumah");
        map.put("B602110018", "Miriam Naa Adotey");
        map.put("B602110019", "Miriam Naa Adotey");
        map.put("B602110020", "Miriam Naa Adotey");
        map.put("B602110021", "Prince Mawuena");
        map.put("B602110022", "Miriam Naa Adotey");
        map.put("A302110030", "ABDUL RAZAK ABBAN");
        map.put("A302110031", "ABDUL RAZAK ABBAN");
        map.put("B410000000005", "Aloysius Acquah");
        map.put("B410000000007", "Aloysius Acquah");
        map.put("B440000000019", "Aloysius Acquah");
        map.put("A142030011", "Aloysius Acquah");
        map.put("A142050017", "Aloysius Acquah");
        map.put("A102090031", "Aloysius Acquah");
        map.put("A1020100005", "Aloysius Acquah");
        map.put("A1020100006", "Aloysius Acquah");
        map.put("A1020100007", "Aloysius Acquah");
        map.put("A1020100009", "Aloysius Acquah");
        map.put("A1020100010", "Aloysius Acquah");
        map.put("A1020100134", "Aloysius Acquah");
        map.put("A1020100136", "Aloysius Acquah");
        map.put("A1020120016", "Aloysius Acquah");
        map.put("A1020120017", "Aloysius Acquah");
        map.put("A1020120018", "Aloysius Acquah");
        map.put("A1020120019", "Aloysius Acquah");
        map.put("A1020120020", "Aloysius Acquah");
        map.put("A1020120051", "Aloysius Acquah");
        return map.containsKey(branchcode) ? map.get(branchcode) : "94";

    }

    public String saveEasyAppTeamLeaders(EasyappTeamTbModel dmodel) {
        String result = "There was a problem saving...";
        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        BranchMappingLogic bmlogic = new BranchMappingLogic();
        TeamIdMappingLogic tmLogic = new TeamIdMappingLogic();
        EasyappTeamTbLogic easylogic = new EasyappTeamTbLogic();
        ProductAgentsModel pagmodel = null;

        try {
            ProductAgentsModel pamodel = new ProductAgentsModel(dmodel);
            ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(pamodel.getPagtReportMgr(), pamodel.getPagtMobile());
            pamodel.setPagtCode(this.getLastSalesManagerID());
            int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
            pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
            pamodel.setPagtSubbranchSysid(branch);
            ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
            if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                getEM().getTransaction().begin();
            }

            if (pamodel.getProductAgentsTbPK().getPagtSysid() == 0) {
                if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                    create(pagent);

                    result = "Agent created successfully...";
                    getEM().getTransaction().commit();
                    ptbLogic.updateReportingID(pamodel.getPagtCode());
                    pagmodel = ptbLogic.getProductAgentsTbById(pamodel.getPagtCode());
                } else {
                    result = "Agent record already added successfully...";
                }
                TeamIdMappingModel tmodel = tmLogic.getTeamIdMappingById(String.valueOf(dmodel.getTeamIndex()));
                if (tmodel.getV2teamId() == 0) {
                    if (dmodel.getTeamId().equals("SM001")) {
                        String f = "SM001";
                    }
                    EasyappTeamTbModel easyteam = easylogic.getEasyappTeamTbById(String.valueOf(dmodel.getTeamIndex()));
                    ProductAgentsModel agent = ptbLogic.getReportName(easyteam.getTeamName());
                    tmodel.setV2teamId(agent.getPagtReportId());
                }
                tmLogic.saveTeamIdMapping(new TeamIdMappingModel(tmodel.getId(), String.valueOf(dmodel.getTeamIndex()), pagmodel == null ? tmodel.getV2teamId() : pagmodel.getPagtReportId()));
            } else {
                edit(pagent);
                result = "Agent updated successfully...";
                getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String saveEasyAppAgents(EasyappAgentsTbModel dmodel) {
        String result = "There was a problem saving...";
        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        TeamIdMappingLogic tmLogic = new TeamIdMappingLogic();
        EasyappTeamTbLogic easyLogic = new EasyappTeamTbLogic();
        AgentCodeMappingLogic acmlogic = new AgentCodeMappingLogic();
        if (dmodel.getAgentsId().equals("C15002110015")) {
            String f = "C15002110015";
        }

        try {
            String id = dmodel.getAgentsTeamId();
            ProductAgentsModel pamodel = new ProductAgentsModel(dmodel);
            ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(pamodel.getPagtReportMgr(), pamodel.getPagtMobile());
            TeamIdMappingModel tmodel = tmLogic.getTeamIdMappingById(id);
            if (tmodel.getV1teamId() == null) {
                ProductAgentsModel pmodel2 = ptbLogic.getReportName(pamodel.getPagtReportMgr());
                if (pmodel2.getPagtReportId() != 0) {
                    pamodel.setPagtReportId(pmodel2.getPagtReportId());
                    pamodel.setPagtReportMgr(pmodel2.getPagtReportMgr());
                } else {
                }
            } else {
                pamodel.setPagtReportId(tmodel.getV2teamId());
                pamodel.setPagtReportMgr(easyLogic.getEasyappTeamTbById(id).getTeamName().toUpperCase());
            }
            int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
            pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
            pamodel.setPagtSubbranchSysid(branch);
            ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
            if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                getEM().getTransaction().begin();
            }

            if (pamodel.getProductAgentsTbPK().getPagtSysid() == 0) {
                if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                    create(pagent);

                    result = "Agent created successfully...";
                    pamodel2.setPagtCode(pamodel.getPagtCode());
                    getEM().getTransaction().commit();

                } else {
                    result = "Agent record already added successfully...";
                }
                AgentCodeMappingModel mapmodel = new AgentCodeMappingModel();
                mapmodel.setStoredCode(pamodel2.getPagtCode());
                List<AgentCodeMappingModel> acmlist = acmlogic.getAgentCodeMappingById(pamodel2.getPagtCode());
                boolean isFound = false;
                for (AgentCodeMappingModel acmmodel : acmlist) {
                    if (dmodel.getAgentsId().equals(acmmodel.getOtherCode())) {
                        isFound = true;
                        mapmodel = acmmodel;
                    }
                }
                if (!isFound && !dmodel.getAgentsId().equals(mapmodel.getStoredCode())) {
                    acmlogic.saveAgentMapping(new AgentCodeMappingModel(mapmodel.getId(), mapmodel.getStoredCode(), dmodel.getAgentsId()));
                }

            } else {
                edit(pagent);
                result = "Agent updated successfully...";
                getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String saveEasyLifeTeamLeaders(EazylifeTeamTbModel dmodel) {
        String result = "There was a problem saving...";
        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        BranchMappingLogic bmlogic = new BranchMappingLogic();
        TeamIdMappingLogic tmLogic = new TeamIdMappingLogic();
        EazylifeTeamTbLogic easylogic = new EazylifeTeamTbLogic();
        ProductAgentsModel pagmodel = null;

        try {
            ProductAgentsModel pamodel = new ProductAgentsModel(dmodel);
            ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(pamodel.getPagtReportMgr(), pamodel.getPagtMobile());
            pamodel.setPagtCode(this.getLastSalesManagerID());
            int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
            pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
            pamodel.setPagtSubbranchSysid(branch);
            ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
            if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                getEM().getTransaction().begin();
            }

            if (pamodel.getProductAgentsTbPK().getPagtSysid() == 0) {
                if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                    create(pagent);

                    result = "Agent created successfully...";
                    getEM().getTransaction().commit();
                    ptbLogic.updateReportingID(pamodel.getPagtCode());
                    pagmodel = ptbLogic.getProductAgentsTbById(pamodel.getPagtCode());
                } else {
                    result = "Agent record already added successfully...";
                }
                TeamIdMappingModel tmodel = tmLogic.getTeamIdMappingById(String.valueOf(dmodel.getTeamIndex()));
                if (tmodel.getV2teamId() == 0) {
                    if (dmodel.getTeamId().equals("SM001")) {
                        String f = "SM001";
                    }
                    EazylifeTeamTbModel easyteam = easylogic.getEazylifeTeamTbById(String.valueOf(dmodel.getTeamIndex()));
                    ProductAgentsModel agent = ptbLogic.getReportName(easyteam.getTeamName());
                    tmodel.setV2teamId(agent.getPagtReportId());
                }
                tmLogic.saveTeamIdMapping(new TeamIdMappingModel(tmodel.getId(), String.valueOf(dmodel.getTeamIndex()), pagmodel == null ? tmodel.getV2teamId() : pagmodel.getPagtReportId()));
            } else {
                edit(pagent);
                result = "Agent updated successfully...";
                getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

    public String updateRecord(ProductAgentsModel dmodel) {
        String result = "There was a problem saving...";

        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        AosTeamTbModel aosSM = new AosTeamTbLogic().getAosAgentsTbByFullname(dmodel.getPagtReportMgr());
        EasyappTeamTbModel eazy1SM = new EasyappTeamTbLogic().getAosAgentsTbByFullname(dmodel.getPagtReportMgr());
        EazylifeTeamTbModel eazy2SM = new EazylifeTeamTbLogic().getAosAgentsTbByFullname(dmodel.getPagtReportMgr());
        ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(dmodel.getPagtReportMgr(), dmodel.getPagtMobile());
        if(pamodel2.getPagtCode() != null){
            dmodel.setPagtReportId(pamodel2.getProductAgentsTbPK().getPagtSysid());
        ProductAgentsTb pagent = new ProductAgentsTb(dmodel);
            getEM().getTransaction().begin();
            edit(pagent);
            getEM().getTransaction().commit();
            dmodel.getProductAgentsTbPK().setPagtPalLevelId(2);
            dmodel.getProductAgentsTbPK().setPagtPahSysid(2);
            dmodel.setPagtLevel("S.Mgr");
            dmodel.setPagtLevel("Team Leader");
        }
        String n = this.getManager(dmodel.getPagtCode());
        if (!n.equals(dmodel.getPagtReportMgr()) && !n.equals("94")) {
            dmodel.setPagtReportMgr(n);
            dmodel.setPagtReportId(pamodel2.getPagtReportId());
            ProductAgentsTb pagent = new ProductAgentsTb(dmodel);
            getEM().getTransaction().begin();
            edit(pagent);
            getEM().getTransaction().commit();
            ProductAgentsModel pamodel3 = ptbLogic.checkIfExisting(n, dmodel.getPagtMobile());
            if(pamodel3.getPagtCode() == null){
               aosSM = new AosTeamTbLogic().getAosAgentsTbByFullname(dmodel.getPagtReportMgr());
             eazy1SM = new EasyappTeamTbLogic().getAosAgentsTbByFullname(dmodel.getPagtReportMgr());
             eazy2SM = new EazylifeTeamTbLogic().getAosAgentsTbByFullname(dmodel.getPagtReportMgr());
             pamodel2 = ptbLogic.checkIfExisting(dmodel.getPagtReportMgr(), dmodel.getPagtMobile());
            if (aosSM.getTeamName() != null) {
                ProductAgentsModel pamodel = new ProductAgentsModel(aosSM);
                BranchMappingLogic bmlogic = new BranchMappingLogic();
                pamodel.setPagtCode(this.getLastSalesManagerID());
                int branch = bmlogic.getBranchMappingById(pamodel.getProductAgentsTbPK().getPagtBranchSysid()).getV2Id();
                pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
                pamodel.setPagtSubbranchSysid(branch);
                pagent = new ProductAgentsTb(pamodel);
                getEM().getTransaction().begin();
                create(pagent);
                getEM().getTransaction().commit();
            }
            if (eazy1SM.getTeamName() != null) {
                ProductAgentsModel pamodel = new ProductAgentsModel(eazy1SM);
                int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
                pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
                pamodel.setPagtCode(this.getLastSalesManagerID());
                pamodel.setPagtSubbranchSysid(branch);
                pagent = new ProductAgentsTb(pamodel);
                getEM().getTransaction().begin();
                create(pagent);
                getEM().getTransaction().commit();
            }
            if (eazy2SM.getTeamName() != null) {
                ProductAgentsModel pamodel = new ProductAgentsModel(eazy2SM);
                int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
                pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
                pamodel.setPagtCode(this.getLastSalesManagerID());
                pamodel.setPagtSubbranchSysid(branch);
                pagent = new ProductAgentsTb(pamodel);
                getEM().getTransaction().begin();
                create(pagent);
                getEM().getTransaction().commit();
            }
            }
        }
        
        if (pamodel2.getPagtCode() == null) {
            if (aosSM.getTeamName() != null) {
                ProductAgentsModel pamodel = new ProductAgentsModel(aosSM);
                BranchMappingLogic bmlogic = new BranchMappingLogic();
                pamodel.setPagtCode(this.getLastSalesManagerID());
                int branch = bmlogic.getBranchMappingById(pamodel.getProductAgentsTbPK().getPagtBranchSysid()).getV2Id();
                pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
                pamodel.setPagtSubbranchSysid(branch);
                ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
                getEM().getTransaction().begin();
                create(pagent);
                getEM().getTransaction().commit();
            }
            if (eazy1SM.getTeamName() != null) {
                ProductAgentsModel pamodel = new ProductAgentsModel(eazy1SM);
                int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
                pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
                pamodel.setPagtCode(this.getLastSalesManagerID());
                pamodel.setPagtSubbranchSysid(branch);
                ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
                getEM().getTransaction().begin();
                create(pagent);
                getEM().getTransaction().commit();
            }
            if (eazy2SM.getTeamName() != null) {
                ProductAgentsModel pamodel = new ProductAgentsModel(eazy2SM);
                int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
                pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
                pamodel.setPagtCode(this.getLastSalesManagerID());
                pamodel.setPagtSubbranchSysid(branch);
                ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
                getEM().getTransaction().begin();
                create(pagent);
                getEM().getTransaction().commit();
            }

        } else {
            String mgr = this.getManager(dmodel.getPagtCode());
            if (!mgr.equals(dmodel.getPagtReportMgr())) {
                ProductAgentsModel pamodel = this.getProductAgentsTbMgr(mgr);
                if (pamodel.getPagtReportMgr() != null) {
                    dmodel.setPagtReportMgr(mgr);
                    dmodel.setPagtReportId(pamodel2.getPagtReportId());
                    ProductAgentsTb pagent = new ProductAgentsTb(dmodel);
                    getEM().getTransaction().begin();
                    edit(pagent);
                    getEM().getTransaction().commit();
                }
            }
        }

        return "";
    }

    public String saveEasyLifeAgents(EazylifeAgentsTbModel dmodel) {
        String result = "There was a problem saving...";
        ProductAgentsTbLogic ptbLogic = new ProductAgentsTbLogic();
        TeamIdMappingLogic tmLogic = new TeamIdMappingLogic();
        EazylifeTeamTbLogic easyLogic = new EazylifeTeamTbLogic();
        AgentCodeMappingLogic acmlogic = new AgentCodeMappingLogic();

        try {
            String id = dmodel.getAgentsTeamId();
            ProductAgentsModel pamodel = new ProductAgentsModel(dmodel);
            ProductAgentsModel pamodel2 = ptbLogic.checkIfExisting(pamodel.getPagtReportMgr(), pamodel.getPagtMobile());
            TeamIdMappingModel tmodel = tmLogic.getTeamIdMappingById(id);
            if (tmodel.getV1teamId() == null) {
                ProductAgentsModel pmodel2 = ptbLogic.getReportName(pamodel.getPagtReportMgr());
                if (pmodel2.getPagtReportId() != 0) {
                    pamodel.setPagtReportId(pmodel2.getPagtReportId());
                    pamodel.setPagtReportMgr(pmodel2.getPagtReportMgr());
                } else {
                }
            } else {
                pamodel.setPagtReportId(tmodel.getV2teamId());
                pamodel.setPagtReportMgr(easyLogic.getEazylifeTeamTbById(id).getTeamName().toUpperCase());
            }
            int branch = this.getDestinationBranch(String.valueOf(pamodel.getProductAgentsTbPK().getPagtBranchSysid()));
            pamodel.getProductAgentsTbPK().setPagtBranchSysid(branch);
            pamodel.setPagtSubbranchSysid(branch);
            ProductAgentsTb pagent = new ProductAgentsTb(pamodel);
            if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                getEM().getTransaction().begin();
            }

            if (pamodel.getProductAgentsTbPK().getPagtSysid() == 0) {
                if (pamodel2.getProductAgentsTbPK().getPagtSysid() == 0) {
                    create(pagent);

                    result = "Agent created successfully...";
                    pamodel2.setPagtCode(pamodel.getPagtCode());
                    getEM().getTransaction().commit();

                } else {
                    result = "Agent record already added successfully...";
                }
                AgentCodeMappingModel mapmodel = new AgentCodeMappingModel();
                mapmodel.setStoredCode(pamodel2.getPagtCode());
                List<AgentCodeMappingModel> acmlist = acmlogic.getAgentCodeMappingById(pamodel2.getPagtCode());
                boolean isFound = false;
                for (AgentCodeMappingModel acmmodel : acmlist) {
                    if (dmodel.getAgentsId().equals(acmmodel.getOtherCode())) {
                        isFound = true;
                        mapmodel = acmmodel;
                    }
                }
                if (!isFound && !dmodel.getAgentsId().equals(mapmodel.getStoredCode())) {
                    acmlogic.saveAgentMapping(new AgentCodeMappingModel(mapmodel.getId(), mapmodel.getStoredCode(), dmodel.getAgentsId()));
                }

            } else {
                edit(pagent);
                result = "Agent updated successfully...";
                getEM().getTransaction().commit();
            }

        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
