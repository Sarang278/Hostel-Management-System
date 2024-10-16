package com.hms.ServiceImpl;

import java.util.List;

import com.hms.DaoImpl.PaymentDaoImpl;
import com.hms.Service.PaymentService;
import com.hms.entity.Payment;

public class PaymentServiceImpl implements PaymentService {

    private PaymentDaoImpl paymentDao = new PaymentDaoImpl();

    @Override
    public void addPayment(Payment payment) {
        paymentDao.savePayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

    @Override
    public List<Payment> listAllPayments() {
        return paymentDao.getAllPayments();
    }

    @Override
    public void updatePayment(Payment payment) {
        paymentDao.updatePayment(payment);
    }

    @Override
    public void removePayment(Long id) {
        paymentDao.deletePayment(id);
    }
}

