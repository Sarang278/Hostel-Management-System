package com.hms.DaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hms.HibernateUtil;
import com.hms.Dao.BookingDao;
import com.hms.entity.Booking;

import java.util.List;

public class BookingDaoImpl implements BookingDao {

    @Override
    public void saveBooking(Booking booking) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(booking);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public Booking getBookingById(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Booking.class, id);
        }
    }

    @Override
    public List<Booking> getAllBookings() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Booking", Booking.class).list();
        }
    }

    @Override
    public void updateBooking(Booking booking) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(booking);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBooking(Long id) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Booking booking = session.get(Booking.class, id);
            if (booking != null) {
                session.delete(booking);
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
