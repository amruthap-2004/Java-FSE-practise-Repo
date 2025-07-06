package com.example.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Optional;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("🚀 Starting Library Management System...");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) context.getBean("bookService");
        
        // Test 1: Display all books
        bookService.displayAllBooks();
        
        // Test 2: Find a specific book
        Optional<Book> foundBook = bookService.findBookById("2");
        if (foundBook.isPresent()) {
            System.out.println("✅ Found book: " + foundBook.get());
        } else {
            System.out.println("❌ Book not found");
        }
        
        // Test 3: Add a new book
        Book newBook = bookService.addBook("4", "Effective Java", "Joshua Bloch");
        System.out.println("✅ Added new book: " + newBook);
        
        // Test 4: Display updated catalog
        bookService.displayAllBooks();
        
        // Test 5: Remove a book
        boolean removed = bookService.removeBook("1");
        System.out.println("🗑️ Book removal result: " + removed);
        
        // Test 6: Final catalog display
        bookService.displayAllBooks();
        
        System.out.println("🎉 Library Management System Demo Complete!");
    }
} 