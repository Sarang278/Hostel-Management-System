package com.hms.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hostels")
public class Hostel extends BaseEntity {

    private String name;
    private String address;
    
    @OneToMany(mappedBy = "hostel")
    private List<Room> rooms;

    // Getters, Setters, Constructors, and toString

    public Hostel() {}

    public Hostel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
