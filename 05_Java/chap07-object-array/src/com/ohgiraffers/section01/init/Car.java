package com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {    // new로 객체 생성할때 2가지는 무조건 전달해야됨(기본 생성자 없기 때문)
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {   // 어떤 인스턴스에서 호출하는지에 따라 값이 달라짐
        System.out.println(this.modelName + "가" + this.maxSpeed + "km/h로 쌩~ 달려갑니다!");
    }

    public String getModelName() {
        return modelName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
