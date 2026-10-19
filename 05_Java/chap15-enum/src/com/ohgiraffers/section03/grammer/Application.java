package com.ohgiraffers.section03.grammer;

public class Application {
    public static void main(String[] args) {

        // ADMIN, GUEST, USER 등을 상수로 많이 사용
        // but 사용자 화면에는 한글로 관리자, 게스트 등등으로 표시할 필요가 있음
        // enum 상수는 enum타입의 객체임
        // 생성자를 활용할 수 있음

        UserRole admin = UserRole.ADMIN;    // new 키워드로 객체 생성

        UserRole guest = UserRole.GUEST;    // 이미 위에서 준비된 상수 참조

        System.out.println(admin.name());
        System.out.println(admin.getDeclaringClass());
        System.out.println(admin.getNameTOLowerCase());
    }
}
