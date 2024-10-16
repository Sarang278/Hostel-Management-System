package com.hms.entity;

import javax.persistence.*;

@Entity
@Table(name = "wardens")
public class Warden extends BaseEntity {

    private String name;
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "hostel_id")
    private Hostel hostel;

    // Getters, Setters, Constructors, and toString

    public Warden() {}

    public Warden(String name, String phoneNumber, Hostel hostel) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.hostel = hostel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }

    @Override
    public String toString() {
        return "Warden{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hostel=" + hostel.getName() +
                '}';
    }
}
