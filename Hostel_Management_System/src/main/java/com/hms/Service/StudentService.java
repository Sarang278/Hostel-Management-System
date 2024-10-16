package com.hms.Service;

import java.util.List;

import com.hms.entity.Student;

public interface StudentService {
    void addStudent(Student student);
    Student getStudentById(Long id);
    List<Student> listAllStudents();
    void updateStudent(Student student);
    void removeStudent(Long id);
}


