package com.secion01.practice;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int num  = sc.nextInt();

        String text = (num >= 60) ? "합격입니다~~!!!" : "아쉽지만 불합격입니다....";

        System.out.println(text);
    }
}
