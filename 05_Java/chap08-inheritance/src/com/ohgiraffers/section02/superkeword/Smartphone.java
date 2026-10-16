package com.ohgiraffers.section02.superkeword;

// Product 클래스를 상속받는다
public class Smartphone extends Product{

    // 스마트폰만의 통신사(agency) 필드를 추가
    private String agency;

    // 부모 필드 포함 모든 필드를 초기화 하는 생성자
    public Smartphone() {
        super();
    }


    public Smartphone(String code, String name, int price, String agency) {
        super(code, name, price);
        this.agency = agency;
    }


    // getInformation() 메소드 오버라이딩
    @Override
    public String getInformation() {
        String productInfo = super.getInformation();
        String smartphoneInfo = agency;
        return productInfo + " " + smartphoneInfo;
    }


}
