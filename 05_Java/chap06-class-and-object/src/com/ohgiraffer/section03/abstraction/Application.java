package com.ohgiraffer.section03.abstraction;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Controller -> Service -> Repository
        // 사용자 -> 레이서 -> 자동차 - mvc패턴
        // 요구사항이 바껴서 stop을 했을때 속도를 반만 줄이려고 할때 car의 stop 메서드만 바꾸면 됨 -> 유지보수 매우 유리
        // 메세지를 서로 주고받아 처리함 -> 추상화

        /*
        * [추상화]
        * 복잡한 내부 구현은 숨기고, 외부에는 필요한 기능만 의미있는 이름으로 보여주는 것
        *
        * 프로그램에서 필요한 특징과 기능만 골라 객체로 표현하고,
        * 사용하는 쪽에는 복잡한 내부 처리 대신에 필요한 기능을 보여주는 설계 방식이다.
        * */

        // 이 객체가 외부에 어떤 기능을 제공해야하는지를 고려해야한다

        // 카레이서 객체 생성
        CarRacer racer = new CarRacer();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. 시동 걸기");
            System.out.println("2. 엑셀 밟기");
            System.out.println("3. 브레이크 밟기");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                // 사용자는 카레이서에게 '요청'
                case 1:
                    racer.starUp();
                    break;      // break문을 쓰지 않으면 stepAccelerator도 실행이 됨
                case 2:
                    racer.stepAccelerator();
                    break;
                case 3:
                    racer.stepBrake();
                    break;
                case 4:
                    racer.turnOff();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택했습니다");
                    break;

            }
        }

    }
}
