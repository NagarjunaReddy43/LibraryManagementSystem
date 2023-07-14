package com.NagarjunaReddy.librarymanagementproject.Controller;

import com.NagarjunaReddy.librarymanagementproject.DTO.StudentResponseDto;
import com.NagarjunaReddy.librarymanagementproject.DTO.StudentUpdateEmailRequestDto;
import com.NagarjunaReddy.librarymanagementproject.Entity.Student;
import com.NagarjunaReddy.librarymanagementproject.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){
        return studentService.findStudentByEmail(email);
    }


    @PutMapping("/update_email")
    public StudentResponseDto updateEmail(StudentUpdateEmailRequestDto studentUpdateEmailRequestDto){
        return studentService.updateEmail(studentUpdateEmailRequestDto);
    }

}
