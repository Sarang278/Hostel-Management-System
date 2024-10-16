package com.hms.DaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hms.HibernateUtil;
import com.hms.Dao.WardenDao;
import com.hms.entity.Warden;

import java.util.List;

public class WardenDaoImpl implements WardenDao {

    @Override
    public void saveWarden(Warden warden) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(warden);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Warden getWardenById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Warden.class, id);
        }
    }

    @Override
    public List<Warden> getAllWardens() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Warden", Warden.class).list();
        }
    }

    @Override
    public void updateWarden(Warden warden) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(warden);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteWarden(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Warden warden = session.get(Warden.class, id);
            if (warden != null) {
                session.delete(warden);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
