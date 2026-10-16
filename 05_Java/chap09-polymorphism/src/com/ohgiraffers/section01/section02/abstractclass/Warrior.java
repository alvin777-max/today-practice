package com.ohgiraffers.section01.section02.abstractclass;

public class Warrior extends Player{
    // 추상클래스를 상속받는 일반 클래스는 추상 메소드를 반드시 오버라이딩 해줘야함 - 그렇지 않으면 컴파일 에러 발생

    @Override
    public void attack() {
        System.out.println("전사가 검으로 베기 공격을 합니다. 슈슉!!");
    }
}
