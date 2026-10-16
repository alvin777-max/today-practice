package com.ohgiraffers.section01.section02.abstractclass;

public class Application {
    public static void main(String[] args) {


        /*
        * [추상 클래스]
        * 직접 객체를 생성할 수 없으며, 자식 클래스의 공통 기능을 정의하는 부모 클래스
        * */

//        Player player = new Player();   // 추상 클래스이기에 직접 객체를 생성하지 못함 - 공통된 부모 역할을 하기 위함임

        Warrior warrior = new Warrior();
        warrior.attack();

        Wizard wizard = new Wizard();
        wizard.attack();

        Player[] players = new Player[2];
        players[0] = new Warrior();
        players[1] = new Wizard();

        for (Player player : players) {
            player.attack();    // 동적 바인딩 동작 - 실제 객체의 메소드 동작
            player.levelUp();   // levelup은 오버라이딩 하지 않음 - 부모의 메소드 동작
        }

    }
}
