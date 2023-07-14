package com.NagarjunaReddy.librarymanagementproject.Service;

import com.NagarjunaReddy.librarymanagementproject.DTO.StudentResponseDto;
import com.NagarjunaReddy.librarymanagementproject.DTO.StudentUpdateEmailRequestDto;
import com.NagarjunaReddy.librarymanagementproject.Entity.LibraryCard;
import com.NagarjunaReddy.librarymanagementproject.Entity.Student;
import com.NagarjunaReddy.librarymanagementproject.Enum.CardStatus;
import com.NagarjunaReddy.librarymanagementproject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        LibraryCard card = new LibraryCard();

        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("03/2025");
        card.setStudent(student);

        student.setCard(card);

        studentRepository.save(student);
    }

    public String findStudentByEmail(String email) {

        Student student = studentRepository.findByEmail(email);

        return student.getName();
    }

    public StudentResponseDto updateEmail(StudentUpdateEmailRequestDto studentUpdateEmailRequestDto){
        Student student = studentRepository.findById(studentUpdateEmailRequestDto.getId()).get();

        // updating the email of student

        student.setEmail(studentUpdateEmailRequestDto.getEmail());

        // convert updated student to response dto
        Student updatedStudent = studentRepository.save(student);

        StudentResponseDto studentResponseDto  = new StudentResponseDto();

        studentResponseDto.setId(updatedStudent.getId());

        studentResponseDto.setName(updatedStudent.getName());

        studentResponseDto.setEmail(updatedStudent.getEmail());

        return studentResponseDto;
    }

//    public List<Student> getStudentsListOfParticularAge(int age) {
//        List<Student> students = studentRepository.findByAge(age);
//        return students;
//    }
}
