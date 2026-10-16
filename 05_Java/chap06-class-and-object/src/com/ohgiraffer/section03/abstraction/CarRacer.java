package com.ohgiraffer.section03.abstraction;

public class CarRacer {

    // 자신의 자동차를 가지고 있다 ( 소유관계 / has-a 관계)
    // final + 변수명이기에 참조값 재대입 불가능(처음 new로 생성했던 객체만 참조)
    private final Car myCar = new Car();

    // 시동을 걸도록 명령
    public void starUp() {
        myCar.starUp();
    }
    // 액셀 밟도록 명령
    public  void stepAccelerator() {
        myCar.go();
    }
    // 브레이크 밟도록 명령
    public void stepBrake() {
        myCar.stop();
    }
    // 시동 끄도록 명령
    public void turnOff() {
        myCar.turnOff();
    }
}
