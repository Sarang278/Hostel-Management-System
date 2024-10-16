package com.hms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rooms")
public class Room extends BaseEntity {

    private String roomNumber;
    private int capacity;

    @ManyToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    @OneToMany(mappedBy = "room")
    private List<Booking> bookings;

    // Getters, Setters, Constructors, and toString

    public Room() {}

    public Room(String roomNumber, int capacity, Hostel hostel) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.hostel = hostel;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", capacity=" + capacity +
                ", hostel=" + hostel.getName() +
                '}';
    }
}
