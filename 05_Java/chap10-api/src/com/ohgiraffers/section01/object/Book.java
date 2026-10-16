package com.ohgiraffers.section01.object;

import java.util.Objects;

public class Book {
    // extends obeject를 적지는 않았지만 기본적으로 object를 상속받고 있음

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    // object(부모클래스)의 메서드(toString)을 오버라이딩 해서 원하는 값을 얻을 수 있음
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    // Alt + insert -> equls및 해시코드 -> 두 메서드가 묶여서 오버라이딩됨
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;  // null이 아닌지, 같은 클래스인지
        Book book = (Book) o;   // 다운캐스팅
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
        // 필드의 자료형에 따라 다른 방법으로 비교. String은 equls로 안전하게 비교
    }

    // equls가 true를 반환하면 해시코드도 true를 반환해야한다는 규칙이 존재 - 해시도 오버라이딩
    // 필드값이 같으면 해시값도 값도 같아지게 만듬
    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
