package com.models;

public class Book {

    private String name;
    private String bookAuthor;

    public Book() {}

    public Book(String name, String bookAuthor) {
        this.name = name;
        this.bookAuthor = bookAuthor;
    }

    public String getName() {
        return name;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}

