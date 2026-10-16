package com.ohgiraffer.section06.finalkeword;

public class Application {
    public static void main(String[] args) {

        // final 변수
        System.out.println("원주율 : " + MathConstant.PI);
//        MathConstant.PI = 3.14; // final 변수 재할당 불가

        // final 인스턴스 필드
        Person person = new Person("000000-1111111", "홀길동");
        System.out.println(person.getName());

        person.setName("유관순");
        System.out.println(person.getName());
//        person.ssn = "010101-2222222";    // final 필드 변경 불가
    }
}
