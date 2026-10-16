package com.ohgiraffers.section01.section02.abstractclass;

public abstract class Player {
    /*
    * [추상 클래스]
    * - abstract 키워드로 선언
    * - 일반 메소드와 추상 메소드를 모두 가질 수 있다.
    * - 추상 메소드는 몸체가 없으며 자식 클래스에서 반드시 오버라이딩 해야한다.
    * - 참조변수 타입으로는 사용할 수 있다(객체로 만들수는 없음) - 다형성 적용 가능
    * */

    // 추상클래스는 추상메소드가 없을 수 있지만 하나라도 있다면 추상클래스여아함
    // 추상 메소드는 몸체가 없어야함

    // 몸체가 없는 추상 메소드
    public abstract void attack();  // 자식클래스에서 오버라이딩해서 쓰도록 강제함 - 내용은 정해놓지 않음

    // 일반 메소드
    public void levelUp() {
        System.out.println("레벨업!!");
    }
}
