package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentSevice {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Julia",
                        "julia.exemplo@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 17),
                        21

                )
        );
    }
}
