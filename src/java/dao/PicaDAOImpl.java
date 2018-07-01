/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Pica;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import util.HibernateUtil;

/**
 *
 * @author Marija
 */
public class PicaDAOImpl extends GenericDAOImpl<Pica> implements PicaDAO{
    Session session;

    @Override
    public List<Pica> getByVrstaPice(String vrstaPice) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Pica> lista = null;
        try {
            lista = session.createCriteria(Pica.class)
                    .add(Restrictions.eq("vrsta_pice", vrstaPice))
                    .addOrder(Order.asc("cena"))
                    .list();
        } catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
        return lista;
    }

    @Override
    public void deletePicaByID(int id) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
           Pica p = (Pica)session.createCriteria(Pica.class).add(Restrictions.eq("id", id)).uniqueResult();
           Transaction t = session.beginTransaction();
           session.delete(p);
           t.commit();
            
        }catch(HibernateException ex){
            ex.printStackTrace();
        }finally{
            session.close();
        }
    }

    
    
}
