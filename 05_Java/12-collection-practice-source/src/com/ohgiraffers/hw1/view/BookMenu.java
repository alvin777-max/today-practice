package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);

    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void mainMenu() {

    }

    public BookDTO BookDTO() {
            return null;
    }

    public int inputBook() {
        return 0;
    }

    public String inputBookTitle() {
        return "";
    }

    public List<BookDTO> selectSortedBook() {
        return null;
    }
}
