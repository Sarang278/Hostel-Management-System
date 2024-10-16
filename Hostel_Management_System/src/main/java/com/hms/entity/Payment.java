package com.hms.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
public class Payment extends BaseEntity {

    private double amount;

    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    // Getters, Setters, Constructors, and toString

    public Payment() {}

    public Payment(double amount, Date paymentDate, Booking booking) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.booking = booking;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", booking=" + booking +
                '}';
    }
}
