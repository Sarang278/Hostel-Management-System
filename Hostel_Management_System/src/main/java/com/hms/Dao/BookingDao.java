package com.hms.Dao;

import java.util.List;

import com.hms.entity.Booking;

public interface BookingDao {
    void saveBooking(Booking booking);
    Booking getBookingById(Long id);
    List<Booking> getAllBookings();
    void updateBooking(Booking booking);
    void deleteBooking(Long id);
}

