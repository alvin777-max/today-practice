package com.ohgiraffer.section03.dto;

public class MemberDTO {

    /* DTO(Data Transfer Object)
    * 여러 데이터를 하나로 묶어 전달하기 위한 객체이다.*/

    // 필드는 무조건 private
    // 필드에 접근할 수 있는 getter, setter 있어야함
    // 할 수 있는 행동, 비즈니스 로직은 대부분 없음

    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private boolean isActivated;


    // Alt + insert - getter 및 setter - shift후 전체 선택
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // boolean 값은 getter을 is로 시작함
    public boolean isActivated() {
        return isActivated;
    }

    public void setActivated(boolean activated) {
        isActivated = activated;
    }
}
