package com.example.library.service;

import com.example.library.model.Book;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    public String getBookInfo() {
        return "Book information";
    }

    public List<Book> getAllBooks() {
        return Arrays.asList(
            new Book("Effective Java", "Joshua Bloch"),
            new Book("Clean Code", "Robert C. Martin")
        );
    }
} 