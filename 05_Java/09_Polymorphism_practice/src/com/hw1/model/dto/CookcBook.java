package com.hw1.model.dto;

public class CookcBook extends Book{

    private boolean coupon;

    public CookcBook() {
        super();
    }

    public CookcBook(String title,String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public String toString() {
        String parentBook = super.toString();
        return parentBook + coupon;

    }
}
