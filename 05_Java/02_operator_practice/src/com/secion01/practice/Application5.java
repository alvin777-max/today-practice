package com.secion01.practice;

import java.util.Scanner;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("월, 일 입력 : ");

        int month = sc.nextInt();
        int day = sc.nextInt();

        String text = ((month >= 1 && month <= 6) && (day >= 1 && day <= 15)) ? "배민 쿠폰"
                : ((month >= 7 && month <= 12) && (day >= 16 && day <= 31)) ? "스타벅스 커피" : "사탕";

        System.out.println("나의 선물은 " + text + "입니다.");
    }
}
