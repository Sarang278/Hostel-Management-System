package com.hms.ServiceImpl;

import java.util.List;

import com.hms.DaoImpl.BookingDaoImpl;
import com.hms.Service.BookingService;
import com.hms.entity.Booking;

public class BookingServiceImpl implements BookingService {

    private BookingDaoImpl bookingDao = new BookingDaoImpl();

    @Override
    public void addBooking(Booking booking) {
        bookingDao.saveBooking(booking);
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingDao.getBookingById(id);
    }

    @Override
    public List<Booking> listAllBookings() {
        return bookingDao.getAllBookings();
    }

    @Override
    public void updateBooking(Booking booking) {
        bookingDao.updateBooking(booking);
    }

    @Override
    public void removeBooking(Long id) {
        bookingDao.deleteBooking(id);
    }
}

