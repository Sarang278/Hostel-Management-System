package com.hms.Service;

import java.util.List;

import com.hms.entity.Booking;

public interface BookingService {
    void addBooking(Booking booking);
    Booking getBookingById(Long id);
    List<Booking> listAllBookings();
    void updateBooking(Booking booking);
    void removeBooking(Long id);
}
