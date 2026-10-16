package com.secion01.practice;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 : ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int bignum = (num1 > num2) ? num1 : num2;

        System.out.println("두 수 중 큰 수는" + bignum + "입니다." );

    }
}

