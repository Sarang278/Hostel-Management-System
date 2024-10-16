package com.hms.DaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hms.HibernateUtil;
import com.hms.Dao.PaymentDao;
import com.hms.entity.Payment;

import java.util.List;

public class PaymentDaoImpl implements PaymentDao {

    @Override
    public void savePayment(Payment payment) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(payment);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Payment getPaymentById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Payment.class, id);
        }
    }

    @Override
    public List<Payment> getAllPayments() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Payment", Payment.class).list();
        }
    }

    @Override
    public void updatePayment(Payment payment) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(payment);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deletePayment(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Payment payment = session.get(Payment.class, id);
            if (payment != null) {
                session.delete(payment);
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
