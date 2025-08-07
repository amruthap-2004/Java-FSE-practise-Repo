package com.example.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public BookRepository() {
        // Initialize with some sample books
        books.add(new Book("1", "Spring in Action", "Craig Walls"));
        books.add(new Book("2", "Clean Code", "Robert Martin"));
        books.add(new Book("3", "Design Patterns", "Gang of Four"));
    }

    public List<Book> getAllBooks() {
        System.out.println("BookRepository: Fetching all books...");
        return new ArrayList<>(books);
    }

    public Optional<Book> findById(String id) {
        System.out.println("BookRepository: Finding book with id: " + id);
        return books.stream()
                   .filter(book -> book.getId().equals(id))
                   .findFirst();
    }

    public Book save(Book book) {
        System.out.println("BookRepository: Saving book: " + book.getTitle());
        books.add(book);
        return book;
    }

    public boolean deleteById(String id) {
        System.out.println("BookRepository: Deleting book with id: " + id);
        return books.removeIf(book -> book.getId().equals(id));
    }
} 