package com.services;

import com.models.Book;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LibraryService {

    public List<Book> getAllBooks() {
        return List.of(
                new Book("Clean Code", "Robert C. Martin"),
                new Book("Effective Java", "Joshua Bloch"),
                new Book("Spring in Action", "Craig Walls")
        );
    }
}
