package com.example.demo.controller;

import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.example.demo.model.Student;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        // TODO
        return service.findAllStudent();
    }

    @PostMapping("/create")
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable Student email) {
        return service.findByEmail(email);
    }

    @PutMapping("/update")
    public Student updateStudent(Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}
