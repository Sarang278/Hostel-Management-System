package com.hms.ServiceImpl;

import java.util.List;

import com.hms.DaoImpl.StudentDaoImpl;
import com.hms.Service.StudentService;
import com.hms.entity.Student;

public class StudentServiceImpl implements StudentService {

    private StudentDaoImpl studentDao = new StudentDaoImpl();

    @Override
    public void addStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public List<Student> listAllStudents() {
        return studentDao.getAllStudents();
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void removeStudent(Long id) {
        studentDao.deleteStudent(id);
    }
}
