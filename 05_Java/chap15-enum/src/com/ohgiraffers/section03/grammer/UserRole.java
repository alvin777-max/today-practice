package com.ohgiraffers.section03.grammer;

import java.util.Locale;

// 필드, 메서드, 생성자도 작성 가능

public enum UserRole {
    GUEST("게스트"),   // 생성자 함수를 아직 만들지 않아서 매개변수를 받지 못함. 매개변수를 받지 않으면 , 으로 구분하지만 있으면 ;으로 구분
    CONSUMER("구매자"),    // description - 화면에 보여지는 문자열
    PRODUCER("판매자"),
    ADMIN("관리자");

    private final String description ;

    private UserRole(String description) {
        System.out.println("UserRole 생성자 호출" + description);
        this.description = description;
    }

    public String getNameTOLowerCase() {
        // this.name() : 선언 이름을 문자열로 반환
        return this.name().toLowerCase();
    }
}
