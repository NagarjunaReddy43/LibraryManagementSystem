package com.NagarjunaReddy.librarymanagementproject.Repository;

import com.NagarjunaReddy.librarymanagementproject.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
