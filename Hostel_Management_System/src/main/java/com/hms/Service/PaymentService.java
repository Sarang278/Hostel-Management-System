package com.hms.Service;

import java.util.List;

import com.hms.entity.Payment;

public interface PaymentService {
    void addPayment(Payment payment);
    Payment getPaymentById(Long id);
    List<Payment> listAllPayments();
    void updatePayment(Payment payment);
    void removePayment(Long id);
}
