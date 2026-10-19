package com.ohgiraffers.section03.reference;

public class Account {

    private String OwnerName;
    private int balance;

    // 입력 없는 생성자
    public Account() {
        System.out.println("기본 생성자 호출됨");
    }

    // String 받는 생성자
    public Account(String ownerName) {
        OwnerName = ownerName;
        System.out.println("String 생성자 호출됨");
    }

    // String, int 둘 다 받는 생성자
    public Account(String ownerName, int balance) {
        OwnerName = ownerName;
        this.balance = balance;
        System.out.println("String, int 생성자 호출됨");
    }

    // 생성자의 경우 Account::new 로 호출 - Account클래스의 생성자로 객체 생성 - 자바 컴파일러가 매개변수에 따라 알아서 생성자 가져옴
    @Override
    public String toString() {
        return "Account{" +
                "OwnerName='" + OwnerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
