package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentSevice {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Julia",
                        "julia.jamal@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 17),
                        21

                )
        );
    }
}
