package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        /*
        * [상속]
        * 공통 상태와 기능을 부모 클래스에 정의하고,
        * 자식 클래스가 그것을 이어받아 사용하거나 자신의 목적에 맞게 확장하는 방법
        * */

        Car car = new Car();    // new Car() -> 기본 생성자를 호출, runningStatus는 기본값(false)로 초기화된 상태

        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new FireCar();

        fireCar.run(); // FireCar에 run 메소드를 따로 정의하지 않았음에도 사용 가능 - 상속으로 Car(부모 클래스)에서 메소드를 물려받았기에 가능
        fireCar.soundHorn();    // FireCar에 오버라이딩해서 작성해놨던 대로 기능함, isRunning 메서드도 사용되는걸 볼수 있음
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();   // 부모클래스엔 없는 자식의 고유 클래스도 잘 작동함

        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
    }
}
