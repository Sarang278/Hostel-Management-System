package com.hms.DaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hms.HibernateUtil;
import com.hms.Dao.HostelDao;
import com.hms.entity.Hostel;

import java.util.List;

public class HostelDaoImpl implements HostelDao {

    @Override
    public void saveHostel(Hostel hostel) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(hostel);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Hostel getHostelById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Hostel.class, id);
        }
    }

    @Override
    public List<Hostel> getAllHostels() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Hostel", Hostel.class).list();
        }
    }

    @Override
    public void updateHostel(Hostel hostel) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(hostel);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteHostel(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Hostel hostel = session.get(Hostel.class, id);
            if (hostel != null) {
                session.delete(hostel);
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
