package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    @Override
    public void run() {
        super.run();    // 부모의 메소드 호출
        System.out.println("레이상카가 전속력으로 질주합니다!!!!!");   // 부모가 하는일 유지하면서 메세지만 추가한 형태
    }
}
