package com.ohgiraffers.section04.overfloaw;

public class Application {
    public static void main(String[] args) {

        byte num = 127; // byte의 최대 저장 범위
        num++;  // 1증가

        // 오버플로우: 자료형이 저장할 수 있는 최대 범위를 넘어가는 현상
        System.out.println(num);    // -128

        byte num2 = -128;
        num2--;
        // 언더플로우 : 최솟값보다 작아져 반대편 최대값으로 돌아가는 현상
        System.out.println(num2);   //  127

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("multi = " + multi); // multi = -79669248 오버플로우 발생

        // 계산 시 이미 두 값이 int이므로 연산 중에 이미 오버플로우가 발생
        long longNum = firstNum * secondNum;    // 이미 int형끼리의 계산에서 오버플로우 발생
        System.out.println("longNum = " + longNum); // longNum = -79669248 - 똑같이 오버플로우

        // 피연산자 하나를 미리 long으로 변환하면 전체 계산이 long으로 처리
        long result = (long)firstNum * secondNum;   // long * int -> 알아서 long으로 형변환
        System.out.println("result = " + result);   // result = 700000000000

    }
}
