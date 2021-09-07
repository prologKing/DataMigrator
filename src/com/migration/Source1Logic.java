/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.migration;

/**
 *
 * @author collins
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.util.AbstractFacade;
import com.util.GenericLibrary;
import com.destination1.entity.ComboTable;
import com.model.SourceModel;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bolaji
 */
public class Source1Logic extends AbstractFacade<ComboTable> {
    EntityManager em;
    private Query query;

    public Source1Logic() {
        super(ComboTable.class);
        em = new GenericLibrary().getEM("allzmenu").createEntityManager();
    }

    @Override
    protected EntityManager getEM() {
        return em;
    }

    public List<SourceModel> getSource1() {
        List<SourceModel> dlist = new ArrayList<>();

        try {
            query = getEM().createNamedQuery("ComboTable.findAll");
            //query.setParameter("fieldname", fieldname);

            List<ComboTable> sourcedata = query.getResultList();

            sourcedata.forEach((dd) -> {
                SourceModel dmodel = new SourceModel(dd);
                dlist.add(dmodel);
            });
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dlist;
    }


    public SourceModel getSource1ById(int id) {
        SourceModel dmodel = new SourceModel();

        try {
            query = getEM().createNamedQuery("ComboTable.findBySource1Sysid");
            query.setParameter("branchSysid", id);

            ComboTable sourceData = (ComboTable) query.setMaxResults(1).getSingleResult();
            dmodel = new SourceModel(sourceData);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return dmodel;
    }

    
}
