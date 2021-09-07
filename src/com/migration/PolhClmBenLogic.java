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
import com.destination2.entity.PolhClmBen;
import com.model.PolhClmBenModel;
import com.model.PolhClmInitModel;
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
public class PolhClmBenLogic extends AbstractFacade<PolhClmBen> {

    EntityManager em;
    private Query query;
    
    public PolhClmBenLogic() {
        super(PolhClmBen.class);
        em = new GenericLibrary().getEM("allztrnx").createEntityManager();
    }
    
    @Override
    protected EntityManager getEM() {
        return em;
    }
    
    public List<PolhClmBenModel> getPolhClmBenes() {
        List<PolhClmBenModel> dlist = new ArrayList<>();
        
        try {
            query = getEM().createNamedQuery("PolhClmBen.findAll");
            //query.setParameter("fieldname", fieldname);

            List<PolhClmBen> branches = query.getResultList();
            
            branches.forEach((dd) -> {
                PolhClmBenModel dmodel = new PolhClmBenModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return dlist;
    }
    
    public PolhClmBenModel getPolhClmBenById(int id) {
        PolhClmBenModel dmodel = new PolhClmBenModel();
        
        try {
            query = getEM().createNamedQuery("PolhClmBen.findByPcbSysid");
            query.setParameter("pcbSysid", id);
            
            PolhClmBen dropdown = (PolhClmBen) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhClmBenModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return dmodel;
    }
    
    public PolhClmBenModel getPolhByLastRecord() {
        PolhClmBenModel dmodel = new PolhClmBenModel();
        
        try {
            query = getEM().createNamedQuery("PolhClmBen.findByLastRecord");
            
            PolhClmBen dropdown = (PolhClmBen) query.setMaxResults(1).getSingleResult();
            dmodel = new PolhClmBenModel(dropdown);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return dmodel;
    }
    
    public String saveClmBen(PolhClmInitModel cmodel) {
        String result = "There was a problem saving...";
        
        try {
            PolhClmBenModel dmodel = new PolhClmBenModel(cmodel);
            PolhClmBen branch = new PolhClmBen(dmodel);
            
            getEM().getTransaction().begin();
            
            if (dmodel.getPcbSysid() == 0) {
                create(branch);
                result = "PolhClmBen created successfully...";
                getEM().getTransaction().commit();
                this.saveClmBenCharge(cmodel);
                new PolhClmProLogic().savePolhClmPro(cmodel);
            } else {
                edit(branch);
                result = "PolhClmBen updated successfully...";
                getEM().getTransaction().commit();
            }
            
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
    public String getCharge(String polNum) {
        Map<String, String> map = new HashMap<>();
        map.put("AFSP2020471", "12.204");
        map.put("AFSP2020472", "16.204");
        map.put("AFSP2020473", "16.204");
        map.put("AFSP2020468", "16.204");
        map.put("AFSP2020607", "16.204");
        map.put("AFSP2020608", "16.204");
        map.put("AFSP2020610", "16.204");
        map.put("AFSP2020611", "16.204");
        map.put("AFSP2020612", "16.204");
        map.put("AFSP2020614", "16.204");
        map.put("AFSP2020615", "16.204");
        map.put("AFSP2020617", "16.204");
        map.put("AFSP2020619", "16.204");
        map.put("AFSP2020621", "16.204");
        map.put("AFSP2020622", "16.204");
        map.put("AFSP2020623", "16.204");
        map.put("AFSP2020624", "16.204");
        map.put("AFSP2020625", "16.204");
        map.put("AFSP2020626", "16.204");
        map.put("AFSP2020627", "16.204");
        map.put("AFSP2020629", "16.204");
        map.put("AFSP2020630", "16.204");
        map.put("AFSP2020631", "16.204");
        map.put("AFSP2020632", "16.204");
        map.put("AFSP2020636", "16.204");
        map.put("AFSP2020637", "16.204");
        map.put("AFSP2020639", "16.204");
        map.put("AFSP2020641", "16.204");
        map.put("AFSP2020643", "16.204");
        map.put("AFSP2020644", "16.204");
        map.put("AFSP2020647", "16.204");
        map.put("AFSP2020651", "16.204");
        map.put("AFSP2020655", "16.204");
        map.put("AFSP2020656", "16.204");
        map.put("AFSP2020659", "16.204");
        map.put("AFSP2020660", "16.204");
        map.put("AFSP2020661", "16.204");
        map.put("AFSP2020663", "16.204");
        map.put("AFSP2020664", "16.204");
        map.put("AFSP2020673", "16.204");
        map.put("AFSP2020676", "16.204");
        map.put("AFSP2020678", "16.204");
        map.put("AFSP2020677", "16.204");
        map.put("AFSP2020679", "16.204");
        map.put("AFSP2030055", "16.407");
        map.put("AFSP2030056", "16.407");
        map.put("AFSP2030060", "16.407");
        map.put("AFSP2030063", "16.407");
        map.put("AFSP2030064", "16.407");
        map.put("AFSP2030065", "16.407");
        map.put("AFSP2030066", "16.407");
        map.put("AFSP2030067", "16.407");
        map.put("AFSP2030068", "16.407");
        map.put("AFSP2030069", "16.407");
        map.put("AFSP2030070", "16.407");
        map.put("AFSP2030071", "16.407");
        map.put("AFSP2030072", "16.407");
        map.put("AFSP2030073", "16.407");
        map.put("AFSP2030074", "16.407");
        map.put("AFSP2030086", "16.407");
        map.put("AFSP2030087", "16.407");
        map.put("AFSP2030088", "16.407");
        map.put("AFSP2030090", "16.407");
        map.put("AFSP2030092", "16.407");
        map.put("AFSP2030093", "16.407");
        map.put("AFSP2030096", "16.407");
        map.put("AFSP2030097", "16.407");
        map.put("AFSP2030100", "16.407");
        map.put("AFSP2030101", "16.407");
        map.put("AFSP2030222", "16.407");
        map.put("AFSP2030224", "16.407");
        map.put("AFSP2020465", "16.721");
        map.put("AFSP2020466", "16.721");
        map.put("AFSP2030438", "16.92");
        map.put("AFSP2030667", "16.92");
        return map.containsKey(polNum) ? map.get(polNum) : "0";
    }
    
    public String saveClmBenCharge(PolhClmInitModel cmodel) {
        String result = "There was a problem saving...";
        
        try {
            PolhClmBenModel dmodel = new PolhClmBenModel(cmodel, this.getCharge(cmodel.getPciPolNum()));
            PolhClmBen branch = new PolhClmBen(dmodel);
            
            getEM().getTransaction().begin();
            
            if (dmodel.getPcbSysid() == 0) {
                create(branch);
                result = "PolhClmBen created successfully...";
                getEM().getTransaction().commit();
            } else {
                edit(branch);
                result = "PolhClmBen updated successfully...";
                getEM().getTransaction().commit();
            }
            
        } catch (Exception ex) {
            getEM().getTransaction().rollback();
            System.out.println(ex.getMessage());
        }
        
        return result;
    }
    
}
