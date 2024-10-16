package com.hms.Dao;

import java.util.List;

import com.hms.entity.Payment;

public interface PaymentDao {
    void savePayment(Payment payment);
    Payment getPaymentById(Long id);
    List<Payment> getAllPayments();
    void updatePayment(Payment payment);
    void deletePayment(Long id);
}
