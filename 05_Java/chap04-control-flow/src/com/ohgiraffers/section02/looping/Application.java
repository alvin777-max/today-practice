package com.ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Application app = new Application();
//        app.whyLoops();
//        app.forLoopSum();
//        app.nestedForLoop();
//        app.whileLoop();
        app.doWhileLoop();
    }


    public void whyLoops() {
        /* for문의 초기식, 조건식, 증감식 구조는 JS와 같다
        * 자바에서는 반복 제어 변수의 자료형을 함께 작성한다 */

        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 학생의 이름 입력: ");
        String student1 = sc.nextLine();
        System.out.println("1 번째 학생의 이름은" + student1 + "입니다.");

        System.out.print("2번째 학생의 이름 입력: ");
        String student2 = sc.nextLine();
        System.out.println("2 번째 학생의 이름은" + student2 + "입니다.");

        for(int i = 1; i <= 5; i++) {
            System.out.print(i+"번째 학생의 이름 입력: ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은" + student + "입니다.");
        }
    }

    // 누적 함계 구하기
    public void forLoopSum() {
        // 1부터 사용자가 입력한 숫자까지 합계 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("합계를 구할 양의 정수를 입력:");
        int num = sc.nextInt();

        int sum = 0;    // 반복문 안에 넣는다면 반복문이 실행되는동안 계속 변수가 재생성됨 - 누적 안됨
        for (int i = 1; i <= num; i++ ) {
            sum += i;   // sum = sum + i;
        }
        System.out.println("1부터" +num+"까지의 합은" + sum);   // 최종합계
    }

    // 구구단 ( 중첩 for문 )
    public void nestedForLoop() {
        // 바깥쪽 for문 : 단(2-9) 제어
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println("---" + dan + "단 ---");
            // 안쪽 for문 : 곱하는 수(1-9) 제어
            for ( int su = 1; su <= 9; su++) {
                System.out.println(dan + "*" + su + "=" + dan * su);
            }
            //System.out.println();
        }
    }

    // while문 - 반복횟수가 불명확할 때
    public void whileLoop() {
        Scanner sc = new Scanner(System.in);
        String str = "";

        // 조건을 만족할 동안 계속
        while (!str.equals("exit")) {
            System.out.println("문자열을 입력하세요(exit 입력시 종료): ");
            str = sc.nextLine();
            System.out.println("입력한 문자열 : " + str);
        }
        System.out.println("프로그램을 종료합니다.");
    }

    // do-while: 최소 한 번 실행해야 할 때
    public void doWhileLoop() {
        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.println("문자열을 입력하세요(exit 입력시 종료):");
            str = sc.nextLine();
            System.out.println("입력한 문자열 : " + str);
        } while(!str.equals("exit"));   // do-while문의 while문 뒤에는 ; 붙여줘야함

        System.out.println("프로그램을 종료합니다");
    }
}
