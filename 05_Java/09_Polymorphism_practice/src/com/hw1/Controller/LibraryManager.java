package com.hw1.Controller;


import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

public class LibraryManager {

    private Member mem = null;
    Book[] bList = new Book[5];

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myInfo() {
        return mem.name;
    }

    public Book[] selectAll() {
        return
    }

    public Book[] searchBookr(String keyword) {
        return
    }

    public int rentBook(int index) {
        return
    }

}
