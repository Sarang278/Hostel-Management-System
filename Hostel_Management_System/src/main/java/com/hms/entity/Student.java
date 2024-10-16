package com.hms.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student extends BaseEntity {

    private String name;
    private String email;

    @OneToMany(mappedBy = "student")
    private List<Booking> bookings;

    // Getters, Setters, Constructors, and toString

    public Student() {}

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

