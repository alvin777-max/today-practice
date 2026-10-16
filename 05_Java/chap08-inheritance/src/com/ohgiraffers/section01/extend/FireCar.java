package com.ohgiraffers.section01.extend;

public class FireCar extends Car {
    
    // 생성자는 상속되는 관계는 아님
    public FireCar() {
        super();    // 기본생성자엔 super()가 생략되어있음(쓰지 않아도 컴파일러가 자동으로 추가) - 부모 클래스의 기본 생성자를 호출함
        System.out.println("FireCar 기본 생성자 호출...");
    }

    /* 오버라이딩
    *  부모에게 물려받은 메소드를 자식의 목적에 맞게 같은 형태로 다시 작성하는 것*/
    // 부모와 이름, 매개변수, 반환타입이 같음 - 부모가 가지고 있는 메서드를 자식타입에 맞게 바꾸는것 - 오버라이딩
    @Override   // 컴파일러가 부모 메소드를 올바르게 재정의했는지 검사
    public void soundHorn() {
        if (isRunning()) {
            System.out.println("빠아아아앙!!!");
        } else {
            System.out.println("소방차가 갑니다 비키세요~!!!");
        }
    }

    // 부모 클래스엔 없는 고유 메서드
    // 상속 - 부모것만 물려받는게 아니라 자식의 고유 메서드도 추가 가능
    public void sprayWater() {
        System.out.println("불난 곳을 발견 했습니다 물을 뿌립니다!!💦💦💦💦");
    }


}

