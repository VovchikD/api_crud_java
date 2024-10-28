package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();

    Student saveStudent(Student student);
    Student findByEmail(Student email);

    Student findByEmail(String email);

    Student updateStudent(Student student);
    void deleteStudent(Student student);

    void deleteStudent(String email);
}
