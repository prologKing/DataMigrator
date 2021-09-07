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
import com.destination2.entity.PremResv;
import com.model.PayDetlModel;
import com.model.PolStartDateTbModel;
import com.model.PolhDetlModel;
import com.model.PremResvModel;
import com.model.ProductTransSusuTbModel;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class PremResvLogic extends AbstractFacade<PremResv> {

    EntityManager em;
    private Query query;

    public PremResvLogic() {
        super(PremResv.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<PremResvModel> getPremResvs() {
        List<PremResvModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("PremResv.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PremResv> branches = query.getResultList();

            branches.forEach((dd) -> {
                PremResvModel dmodel = new PremResvModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }
    
     public List<PremResvModel> getPremResvs(String policynum, BigDecimal amnt, String date) {
        List<PremResvModel> dlist = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date2 = LocalDate.parse(date, formatter);

        try {
            query = getEM().createNamedQuery("PremResv.findByCriteria");
            query.setParameter("psPolhNum", policynum);
            query.setParameter("psTrnDt", date2.toString());
            query.setParameter("psAmt", amnt);

            List<PremResv> branches = query.getResultList();

            branches.forEach((dd) -> {
                PremResvModel dmodel = new PremResvModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }

    public PremResvModel getPremResvById(int id) {
        PremResvModel dmodel = new PremResvModel();

        try {
            query = getEM().createNamedQuery("PremResv.findByPsSysid");
            query.setParameter("psSysid", id);

            PremResv bmapping = (PremResv) query.setMaxResults(1).getSingleResult();
            dmodel = new PremResvModel(bmapping);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    public String getNewTransCode(String yyyyMM) {
        String staticString = yyyyMM + "10000";

        try {
            query = this.em.createNativeQuery("SELECT PS_TRN_CODE From prem_resv a WHERE PS_TRN_CODE like '%" + yyyyMM + "%' ORDER BY PS_TRN_CODE DESC LIMIT 1");
            String id = (String) query.setMaxResults(1).getSingleResult();
            int newid = Integer.parseInt(id.substring(8));
            newid++;
            int length = String.valueOf(newid).length();
            staticString = staticString.substring(0, 13 - length) + String.valueOf(newid);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return staticString;
    }

    public String savePremResv(ProductTransSusuTbModel dmodel) {
        String result = "There was a problem saving...";

        try {
            if (dmodel.getSusuTransCredit().compareTo(BigDecimal.ZERO) != -1) {
                PremResvModel presv = new PremResvModel(dmodel);
                PolStartDateTbModel psdmodel = new PolStartDateTbLogic().getPolStartDateTbById(presv.getPsPolhNum());
                PolhDetlModel pdmodel = new PolhDetlLogic().getPolhDetlById(presv.getPsPolhNum());
                if (pdmodel.getPolhDetlPK().getPolhSysid() != 0) {   
                    BigDecimal paidPremium = BigDecimal.ZERO;
                    List<ProductTransSusuTbModel> ptlist = new ProductTransSusuTbLogic().getProductTransSusuTbByPolNum(presv.getPsPolhNum());
                    BigDecimal riskPremium = pdmodel.getPolhGrossModPremBc()== null ? BigDecimal.ZERO: pdmodel.getPolhGrossModPremBc();

                    for (ProductTransSusuTbModel ptsmodel : ptlist) {
                        paidPremium = paidPremium.add(ptsmodel.getSusuTransCredit());
                        if (paidPremium.compareTo(riskPremium) == 0 || paidPremium.compareTo(riskPremium) == 1) {
                            psdmodel.setPolicyNum(presv.getPsPolhNum());
                            psdmodel.setStartDate(ptsmodel.getSusuTransDate());
                            new PolStartDateTbLogic().savePolStartDateTb(psdmodel);
                            break;
                        }

                    }
                    presv.setPsPolhSysid(pdmodel.getPolhDetlPK().getPolhSysid());
                    if (presv.getPsTrnDt() != null) {
                        presv.setPsTrnCode(this.getNewTransCode(presv.getPsTrnDt().substring(0, 8)));
                    }
                    PremResv branch = new PremResv(presv);

                    getEM().getTransaction().begin();

                    if (branch.getPsSysid() == 0) {
                        create(branch);
                        result = "PremResv created successfully...";
                    } else {
                        edit(branch);
                        result = "PremResv updated successfully...";
                    }

                    getEM().getTransaction().commit();
                }else{
                String checker = "";
                }
            }
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }
    
    public String updatePremResv(PremResvModel dmodel, int cnt) {
        String result = "There was a problem saving...";

        try {
            String staticString = dmodel.getPsTrnCode();
            int length = String.valueOf(cnt).length();
            staticString = staticString.substring(0, 13 - length) + String.valueOf(cnt);
            dmodel.setPsTrnCode(staticString);
            PremResv branch = new PremResv(dmodel);
            getEM().getTransaction().begin();
            edit(branch);
            getEM().getTransaction().commit();
            
         } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }

        return result;
    }

}
