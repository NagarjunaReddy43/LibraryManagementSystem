package com.NagarjunaReddy.librarymanagementproject.Repository;

import com.NagarjunaReddy.librarymanagementproject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findByEmail(String mail);//Custom Search based on attribute
    List<Student> findByAge(int id);


}
