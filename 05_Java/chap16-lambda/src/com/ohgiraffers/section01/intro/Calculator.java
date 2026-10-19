package com.ohgiraffers.section01.intro;

/* 함수형 인터페이스: 추상 메소드가 하나인 인터페이스 */
@FunctionalInterface
public interface Calculator {


    int operate(int a, int b);

//    int anotheroperate(int a, int b);     // 인터페이스에 추상메서드가 2개이상이면 람다식 사용 불가
}


