package com.NagarjunaReddy.librarymanagementproject.Controller;

import com.NagarjunaReddy.librarymanagementproject.DTO.BookRequestDTO;
import com.NagarjunaReddy.librarymanagementproject.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    TransactionService transactionService;
    @PostMapping("/issue_Book")
    public String issueBook(@RequestBody BookRequestDTO bookRequestDTO){
        try{
            return transactionService.issueBook(bookRequestDTO);
        }
        catch (Exception excp){
            return excp.getMessage();
        }
    }
    @GetMapping("/transaction_info")
    public String getTransactionInfo(@RequestParam("bookId") Integer bookId, @RequestParam
            ("cardId") Integer cardId){
        return transactionService.getTransactionInfo(bookId,cardId);
    }
}
