package com.ohgiraffers.section02.dimensional;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
//        // 3명 학생의 국어, 영어, 수학 점수를 저장할 2차원 배열
//        int[][] scores = {
//                {80, 78, 67}, {90, 77, 95}, {70, 89, 94}
//        }; // 정변 배열 3X3
//
//        // 각 학생의 총점과 평균 계산 및 출력
//        for (int i = 0; i < scores.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < scores[i].length; j++) {
//                sum += scores[i][j];
//            }
//            double avg = sum / scores[i].length;
//            System.out.println((i + 1) + "번 학생의 총점 : " + sum);
//            System.out.println((i + 1) + "번 학생의 평균: " + avg);
//        }

        // 학생 수와 과목 수 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("학생 수 입력: ");
        int stus = sc.nextInt();

        System.out.print("과목 수 입력: ");
        int sbj = sc.nextInt();


        // 입력받은 수로 배열 생성
        int[][] scores2 = new int[stus][sbj];

        // 점수 입력받기
        for (int i = 0; i < scores2.length; i++) {
            for (int j = 0; j < scores2[i].length; j++) {
                System.out.println((i+1) + "번째 학생의 "+(j+1) + "번째 점수 입력");
                scores2[i][j] = sc.nextInt();
            }


        }
        for (int i = 0; i < scores2.length; i++) {
            System.out.print("\n" + (i+1) + "번째 학생의 점수: ");
            for (int j = 0; j < scores2[i].length; j++) {
                System.out.print(scores2[i][j] + ",");
                if (j+1 == scores2[i].length) {
                    System.out.print(scores2[i][j]);
                }
            }
        }

    }
}
