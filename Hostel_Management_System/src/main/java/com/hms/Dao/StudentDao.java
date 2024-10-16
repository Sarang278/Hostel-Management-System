package com.hms.Dao;

import java.util.List;

import com.hms.entity.Student;

public interface StudentDao {
    void saveStudent(Student student);
    Student getStudentById(Long id);
    List<Student> getAllStudents();
    void updateStudent(Student student);
    void deleteStudent(Long id);
}

