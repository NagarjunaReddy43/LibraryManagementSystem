package com.NagarjunaReddy.librarymanagementproject.Repository;

import com.NagarjunaReddy.librarymanagementproject.Entity.LibraryCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<LibraryCard,Integer> {
}
