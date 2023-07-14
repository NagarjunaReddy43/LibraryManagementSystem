package com.NagarjunaReddy.librarymanagementproject.Service;

import com.NagarjunaReddy.librarymanagementproject.DTO.BookRequestDTO;
import com.NagarjunaReddy.librarymanagementproject.Repository.BookRepository;
import com.NagarjunaReddy.librarymanagementproject.Repository.CardRepository;
import com.NagarjunaReddy.librarymanagementproject.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.jta.ManagedTransactionAdapter;

import javax.transaction.Transaction;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    CardRepository cardRepository
    public String issueBook(BookRequestDTO bookRequestDTO) throws Exception{
        int bookId =bookRequestDTO.g();
        int cardId = bookRequestDTO.();

        Book books = bookRepository.findById(bookId).get();
        Card card = cardRepository.findById(cardId).get();

        Transaction transaction = new Transaction();

        transaction.setBook(book);
        transaction.setCard(card);
        transaction.setTransactionId(UUID.randomUUID().toString());
        transaction.setIssueOperation(true);
        transaction.setTransactionStatus(TransactionStatus.PENDING);

    }
    public String getTransactionInfo(int bookId, int cardId){

    }
}

