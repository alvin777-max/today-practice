package com.section01.practice;

public class Application4 {
    public static void main(String[] args) {

        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        int sum = (int)(korean + math + english);
        // 나누기는 double형이 하나라도 포함되면 double형의 결과값을 반환한다.(지금은 둘다 int기에 int형 반환)
        int average = sum / 3;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average);

    }
}
