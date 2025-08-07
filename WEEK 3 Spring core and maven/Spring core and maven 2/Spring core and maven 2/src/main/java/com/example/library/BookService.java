package com.example.library;

import java.util.List;
import java.util.Optional;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        System.out.println("BookService: Getting all books...");
        return bookRepository.getAllBooks();
    }

    public Optional<Book> findBookById(String id) {
        System.out.println("BookService: Finding book by id: " + id);
        return bookRepository.findById(id);
    }

    public Book addBook(String id, String title, String author) {
        System.out.println("BookService: Adding new book: " + title);
        Book newBook = new Book(id, title, author);
        return bookRepository.save(newBook);
    }

    public boolean removeBook(String id) {
        System.out.println("BookService: Removing book with id: " + id);
        return bookRepository.deleteById(id);
    }

    public void displayAllBooks() {
        System.out.println("\n=== LIBRARY CATALOG ===");
        List<Book> books = getAllBooks();
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            books.forEach(book -> System.out.println(book));
        }
        System.out.println("======================\n");
    }
} 