package com.ohgiraffer.section01.user_type;

public class Application1 {                     // 실행 클래스
    public static void main(String[] args) {

        // int, double, char, String, 배열 -> 자바가 만들어둔 type들
        // 회원 -> 이름 , 나이 ,성별, 등등 여러가지 타입이 함께 움직임
        // 자바에서는 새로운 타입(사용자 정의 타입)을 직접 만들 수 있음 - class를 만들고 실제 객체 생성

        // 개별 변수의 한계
        int age = 20;
        String name = "홍길동";

        System.out.println(name + age);

        /*
        *  [사용자 정의 자료형 사용하기]
        * 1. 객체가 가져야할 데이터와 기능을 클래스로 정의한다.
        * 2. new 연산자를 통해 클래스에 정의된 객체를 생성한다.
        * 3. 생성된 객체를 가리키는 참조 변수를 선언하고 참조값을 저장한다.
        * */

        // 자료형 변수명 = new 클래스명();
        // new로 만들어진 객체는 다 Heap에 만들어짐(Member)
        // member(자료형 참조변수)는 stack에 만들어지고 참조값을 가짐
        Member member = new Member();

        // 생성된 객체(인스턴스)의 필드(속성)에 값 대입
        // '.'(참조 연산자)를 사용한다.

        member.id = "user01";
        member.pwd = "pass01";
        member.name = "판다";
        member.age = 5;
        member.gender = '여';
        member.hobby = new String[]{"볼링", "배드민턴", "영화"};

        System.out.println("아이디 : " + member.id);
        System.out.println("성별 : " + member.gender);

        for(int i = 0; i< member.hobby.length; i++) {
            System.out.print(member.hobby[i] + " ");
        }

        member.age = -5;        // 잘못된 값이 필드에 들어가는걸 방지 - 캡슐화필요
        System.out.println(member.age);
    }
}
