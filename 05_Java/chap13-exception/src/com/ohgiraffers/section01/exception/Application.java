package com.ohgiraffers.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception {   // JVM 이 main을 호출함 - JvM한테 위임 - 프로그램 종료
        
//        int number = Integer.parseInt("abc");   // abc -> 정수변환할 수 없기에 .NumberFormatException
        // 프로그램이 중간에 종료되면 안되기에 예외처리를 해줘야함

        /*
        * 예외처리(Exception Handling)
        *
        * 프로그램 실행중 발생 문제를 감지하고 안내/기록/복구 방법을 정하는 것
        * */

        // Checked Exception - 예외처리 강제
        // Unchecked Exception - 강제는 안함

        ExceptionTest et = new ExceptionTest();

        et.checkEnoughMoney(10000, 50000);

        et.checkEnoughMoney(50000, 10000);

        // 예외가 발생했다면 위 throw에서 실행흐름이 끝나므로 이 줄까지 내려오지 않는다
        System.out.println("프로그램을 종료합니다."); // 출력 안됨
    }
}
