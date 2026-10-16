package com.hw1.model.dto;

public class AniBook extends Book{

    private int accessAge;

    public AniBook() {
        super();
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        String parentBook = super.toString();
        return parentBook + accessAge;

    }
}
