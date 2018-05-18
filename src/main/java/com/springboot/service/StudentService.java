package com.springboot.service;

import com.springboot.dao.FakeStudentDaoImpl;
import com.springboot.dao.StudentDao;
import com.springboot.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("mongoData")
    private StudentDao fakeStudentDaoImpl;

    public Collection<Student> getAllStudents() {
        return fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id) {
        return fakeStudentDaoImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        fakeStudentDaoImpl.removeStudentById(id);
    }

    public void updateStudent(Student student) {
        fakeStudentDaoImpl.updateStudent(student);
    }

    public void addStudent(Student student) {
        fakeStudentDaoImpl.addStudent(student);
    }
}
