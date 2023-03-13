package com.NagarjunaReddy.librarymanagementproject.Repository;

import com.NagarjunaReddy.librarymanagementproject.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
