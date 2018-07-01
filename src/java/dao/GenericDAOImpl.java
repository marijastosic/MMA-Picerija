/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author Marija
 */
public class GenericDAOImpl<T> implements GenericDAO<T> {

    private Session session;

    @Override
    public List<T> readAll(Class<T> p) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            return session.createCriteria(p).list();

        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    @Override
    public void saveOrUpdate(T obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.saveOrUpdate(obj);
            t.commit();

        } catch (HibernateException ex) {
            t.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(T obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.delete(obj);
            t.commit();

        } catch (HibernateException ex) {
            t.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
    }
}
