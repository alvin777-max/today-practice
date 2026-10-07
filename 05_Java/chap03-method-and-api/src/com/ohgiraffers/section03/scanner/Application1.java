package com.ohgiraffers.section03.scanner;

import java.util.Scanner;

// 사용자의 입력받기
public class Application1 {
    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // nextLine() : 엔터 키 이전까지 한 줄 전체를 문자열로 읽음
        System.out.print("이름을 입력하세요 : ");  // println의 ln이 줄바꿈
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        // next() : 공백문자나 개행문자 전 까지를 문자열로 읽음    // 엔터(\n)가 버퍼에 남아있음 그 이후 0번째 순번을 읽어오면 오류발생
        System.out.print("인사말을 입력하세요 : ");
        String greeting = sc.next();
        System.out.println(greeting);

        // nextInt() : 공백 이전까지의 정수 값을 읽음
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();
        System.out.println(age + "살 입니다.");

        // nextDouble() : 공백 이전까지의 실수 값을 읽음

        // 문자를 직접 읿력 받는 기능은 제공하지 않는다
        // 문자열로 입력받고, 원하는 문자를 분리해서 사용해야 한다.
        // java.lang.String의 charAt(index)를 사용한다.

        sc.nextLine();  // 버퍼에 남아있던 개행문자를 처리

        // 문자열로 받은 후 정수로 형변환
        System.out.print("나이를 입력:");
        String ageInput = sc.nextLine();
        int age1 = Integer.parseInt(ageInput);   // 문자열을 숫자로 변환해줌 (숫자로 변환될 수 있는 값)
        System.out.println(age1 + "세 입니다");

        System.out.println("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(0);  // 숫자 입력받은 다음 문자를 입력받으면 오류 발생 -> nextLine()을 한번 더 써서 청소 필요
        System.out.println(ch);

        // scanner은 통로를 여는것 -> 종료되면 자원을 반납해야함
        sc.close(); // 자원 정리

    }
}
