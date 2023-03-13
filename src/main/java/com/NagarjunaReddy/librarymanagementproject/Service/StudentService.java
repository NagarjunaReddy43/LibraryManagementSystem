package com.NagarjunaReddy.librarymanagementproject.Service;

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
}
