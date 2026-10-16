package com.secion01.practice;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("실수 입력 : ");

        double dnum = sc.nextDouble();
        int inum = (int)dnum;

        String grade;
        if(inum >= 90) {
            grade = "A";
        } else if(inum >= 80) {
            grade = "B";
        } else if(inum >= 70) {
            grade = "C";
        } else if(inum >= 60) {
            grade ="D";
        } else {
            grade = "F";
        }
        System.out.println("홍길동의 이번 점수등급은 " + grade + "입니다.");
    }
}