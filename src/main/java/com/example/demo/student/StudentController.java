package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentSevice studentSevice;

    @Autowired
    public StudentController(StudentSevice studentSevice) {
        this.studentSevice = studentSevice;
    }

    @GetMapping
    public List<Student> getStudents(){
        return studentSevice.getStudents();

    }
}
