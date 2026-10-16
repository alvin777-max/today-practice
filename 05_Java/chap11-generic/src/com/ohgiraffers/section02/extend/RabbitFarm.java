package com.ohgiraffers.section02.extend;

/*
* <T extends Rabbit> : Rabbit 또는 Rabbit의 자식 타입만 오도록 제한
* */
//토끼 농장이지만 그냥 T 제네릭스를 쓰면 뱀도 들어올수 있고 String도 들어올 수 있음 -> 매개변수 범위제한 필요
public class RabbitFarm<T extends Rabbit> {     // 실제 객체를 생성할 때 Rabbit과 Rabbit 하위의 객체만 들어갈 수 있도록 제한
// 이미 만들어진 상속관계를 통해 제한 할 수 있음
    private T animal;

    public RabbitFarm() {}

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
