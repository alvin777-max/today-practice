package com.secion01.practice;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");

        int num = sc.nextInt();

        String text = (num % 2 == 0) ? "입력하신 수는 짝수입니다." : "입력하신 수는 홀수입니다.";
        System.out.println(text);

    }
}
