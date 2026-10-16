package com.ohgiraffer.section03.abstraction;

public class Car {

    private boolean isOn;   // 시동 상태 0개의 사용위치
    private  int speed;     // 현재 시속

    // 시동을 거는 기능
    // 스스로 자신의 상태를 판단 - 객체 자기책임
    public void starUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;   //boolean의 초기값은 false이기 때문에 true로 바꿔줌
            System.out.println("시동을 걸었습니다. 출발 준비 완료~");
        }
    }

    // 앞으로 가는 기능
    public void go() {
        if (isOn) {
            System.out.println("앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 시속은 " +this.speed +"km/h 입니다");
        } else {
            System.out.println("시동을 먼저 걸어주세요~");
        }
    }
    public void stop() {
        if (isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("서서히 멈춥니다");
            } else {
                System.out.println("이미 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("시동이 걸려있지 않습니다.");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("먼저 멈춰주세요");
            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다. 운행 종료");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있는 상태입니다.");
        }
    }

}
