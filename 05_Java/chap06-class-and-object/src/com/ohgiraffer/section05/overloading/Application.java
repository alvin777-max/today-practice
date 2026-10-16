package com.ohgiraffer.section05.overloading;

public class Application {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // 오버로딩 적용 전 - 기능에 따라 메서드 이름을 다르게 지어줘야함
        System.out.println(calc.addTwoInts(10,20));
        System.out.println(calc.addTwoDouble(10.5, 20.5));

        // 오버로딩 적용 후
        // 자바가 인자를 보고 알맞는 메서드를 '알아서' 찾아줌
        // 컴파일 타임 다형성
        System.out.println(calc.add(20, 30));
        System.out.println(calc.add(20.5, 30.5));
        System.out.println(calc.add(40, 50, 60));

        // println에도 오버로딩이 이미 적용되어있다
        System.out.println("안녕");

    }
}
