package com.hms;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hms.entity.*;
public class HibernateUtil { 
	private static final SessionFactory sessionFactory = buildSessionFactory(); 
	private static SessionFactory buildSessionFactory() {
		try { 
			return new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(BaseEntity.class).addAnnotatedClass(Booking.class).addAnnotatedClass(Complaint.class).addAnnotatedClass(Hostel.class).addAnnotatedClass(Payment.class).addAnnotatedClass(Room.class).addAnnotatedClass(Student.class).addAnnotatedClass(Warden.class).buildSessionFactory();
		} catch (Throwable ex) { 
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() { 
		return sessionFactory;
	}
}

