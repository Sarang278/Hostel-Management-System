package com.hms.DaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hms.HibernateUtil;
import com.hms.Dao.ComplaintDao;
import com.hms.entity.Complaint;

import java.util.List;

public class ComplaintDaoImpl implements ComplaintDao {

    @Override
    public void saveComplaint(Complaint complaint) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(complaint);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Complaint getComplaintById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Complaint.class, id);
        }
    }

    @Override
    public List<Complaint> getAllComplaints() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Complaint", Complaint.class).list();
        }
    }

    @Override
    public void updateComplaint(Complaint complaint) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(complaint);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteComplaint(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Complaint complaint = session.get(Complaint.class, id);
            if (complaint != null) {
                session.delete(complaint);
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

