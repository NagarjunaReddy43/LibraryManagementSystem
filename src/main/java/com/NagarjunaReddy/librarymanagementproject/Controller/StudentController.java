package com.NagarjunaReddy.librarymanagementproject.Controller;

import com.NagarjunaReddy.librarymanagementproject.Entity.LibraryCard;
import com.NagarjunaReddy.librarymanagementproject.Entity.Student;
import com.NagarjunaReddy.librarymanagementproject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public  String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student has been added successfully";
    }
}
