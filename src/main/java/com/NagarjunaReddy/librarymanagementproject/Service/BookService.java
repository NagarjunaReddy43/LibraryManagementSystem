package com.NagarjunaReddy.librarymanagementproject.Service;

import com.NagarjunaReddy.librarymanagementproject.Entity.Author;
import com.NagarjunaReddy.librarymanagementproject.Entity.Book;
import com.NagarjunaReddy.librarymanagementproject.Repository.AuthorRepository;
import com.NagarjunaReddy.librarymanagementproject.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;
    public void addBook(Book book) throws Exception {
        Author author;
        try {
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch (Exception e){
            throw new Exception("Author not present");
        }

        List<Book> bookswritten = author.getBooks();
        bookswritten.add(book);

        authorRepository.save(author);
    }
}
