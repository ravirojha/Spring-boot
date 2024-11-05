package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.addFirst(new Student("Harry", "Potter"));
        theStudents.addFirst(new Student("Ron", "Weasly"));
        theStudents.addFirst(new Student("Hermoine","Granger"));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        if(studentId > theStudents.size() - 1 || studentId < 0) {
            throw new StudentNotFoundException("Student not found " + studentId);
        }
        return theStudents.get(studentId);
    }


}
