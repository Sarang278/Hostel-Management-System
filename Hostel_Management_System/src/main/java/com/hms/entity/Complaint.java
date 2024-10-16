package com.hms.entity;

import javax.persistence.*;

@Entity
@Table(name = "complaints")
public class Complaint extends BaseEntity {

    private String description;
    
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters, Setters, Constructors, and toString

    public Complaint() {}

    public Complaint(String description, Student student) {
        this.description = description;
        this.student = student;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "description='" + description + '\'' +
                ", student=" + student.getName() +
                '}';
    }
}
