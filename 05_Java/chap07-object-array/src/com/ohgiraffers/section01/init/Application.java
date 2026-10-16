package com.ohgiraffers.section01.init;

public class Application {
    public static void main(String[] args) {

        // car1 = 참조변수 - stack영역에 생성, 인스턴스는 Heap영역에 생성
        Car car1 = new Car("페라리", 300);
        Car car2 = new Car("람보르기니", 350);
        Car car3 = new Car("롤스로이스", 250);

        car1.driveMaxSpeed();
        car2.driveMaxSpeed();
        car3.driveMaxSpeed();
        // 변수의 이름이 다르기에 반복문 사용 힘듬 - Car라는 같은 타입이기에 배열에 넣을 수 있음(객체 배열)

        // 객체 배열 선언
        Car[] carArray = new Car[3];

        System.out.println(carArray[0]);    // 참조자료형의 기본값 : null

        // 메서드 호출 but 오류
        // NullPointerException 발생- carArray[0]의 값은 현재 null - null인 상태에서 메서드를 호출하려 했기에 오류
//        carArray[0].driveMaxSpeed();

        // 똑같이 객체는 Heap영역에 저장 - 배열안에는 참조값 저장됨
        carArray[0] = new Car("페라리", 300);
        carArray[1] = new Car("람보르기니", 350);
        carArray[2] = new Car("롤스로이스", 250);

        carArray[0].driveMaxSpeed();

        for(int i = 0; i < carArray.length; i++) {
            carArray[i].driveMaxSpeed();
        }
        System.out.println();

        // 객체 배열도 선언과 동시에 객체 배열 초기화가 가능하다
        Car[] carArray2 = {
                new Car("페라리", 300),
                new Car("람보르기니", 350),
                new Car("롤스로이스", 250)
        };

        // 새로운 car 객체가 만들어지는게 아니라 객체의 참조값이 전달됨
        for ( Car car : carArray2) {
            car.driveMaxSpeed();
        }

        // 가장 빠른 자동차 찾기 : 객체 배열에 최댓값 탐색 방법 적용
        Car fastestCar = carArray[0];
        for(int i =0; i < carArray.length - 1; i++) {
            if(carArray[i].getMaxSpeed() > fastestCar.getMaxSpeed()) {
                fastestCar = carArray[i];
            }
        }
        System.out.println("가장 빠른 차는 " + fastestCar.getModelName() + "이며 시속은 " + fastestCar.getMaxSpeed() + "입니다");
    }
}
