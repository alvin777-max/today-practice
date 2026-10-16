package com.hw1.model.dto;

public class Book {

    private String title;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {
        return title + " " + author + " " + publisher;
    }

}
