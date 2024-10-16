package com.hms.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    // Getters, Setters, Constructors, and toString

    public Booking() {}

    public Booking(Student student, Room room, Date bookingDate) {
        this.student = student;
        this.room = room;
        this.bookingDate = bookingDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "student=" + student.getName() +
                ", room=" + room.getRoomNumber() +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
