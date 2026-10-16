package com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args) {
        /* private int value;
        * public int getValue() {
        *   return value;
        * 만약 기능은 똑같은데 String형으로 다루고 싶다면 class를 새로 만들어야됨 - 코드 반복됨
        * 제너릭스를 사용해서 클래스 만든 후 나중에 실제 객체 생성때 결정*/

        /* [제네릭]
        * 클래스나 메소드에서 사용할 자료형을 미리 고정하지 않고
        * 사용하는 시점에 결정하는 문법
        *
        * 타입별 중복 코드를 줄이고
        * 잘못된 타입의 데이터가 들어오는 것을 방지한다.
        * */

        NormalBox normalBox = new NormalBox();

        normalBox.setContent("안녕하세요");
        String content = (String)normalBox.getContent();    // 다운캐스팅 필요함

//        normalBox.setContent(123);  // 123 : int값. Object값을 Object에 전달할때 wrapper타입으로 오토박싱해줌 -> Integer 타입으로 저장됨
        // Object에는 숫자도 저장 할 수 있어 자체 컴파일 오류가 발생하지 않는다
        // 하지만 런타임 시점에는 숫자를 String으로 바꾸려는 순간 ClassCaseException이 발생한다.
//        String wrongContent = (String)normalBox.getContent();   // ClassCastException - 런타임에러발생. Integer타입을 string으로 변환하려해서 에러

        // 어떤 타입이든 받기 위해 Object 사용하는것은 위와 같이 문제 발생 -> 제네릭스 사용

        GenericBox<String> stringBox = new GenericBox<>();    // 객체를 만들 때 객체에 들어갈 타입을 지정해줘야함
        //뒤에 <>안의 내용은 생략해도 됨 - 컴파일러가 왼쪽보고 추론함
        stringBox.setContent("안녕"); // 받는 자료형이 String으로 고정됨
//        stringBox.setContent(123);    // 컴파일 오류 발생 - 컴파일 시점에 잘못된 타입을 막아둠 - 타입 안정성

        String strContent =  stringBox.getContent();    // 다운 캐스팅 필요 없음
        /* 제너릭 타입 인자에는 int같은 기본 자료형이 아니라 참조 자료형을 사용한다.
        * 따라서 int가 아닌 Integer로 지정한다. */
        GenericBox<Integer> integerBox = new GenericBox<>();

        integerBox.setContent(123); // 오토박싱
        int intContent = integerBox.getContent();   // getContent의 반환값은 integer이지만 오토언박싱해줌
        // 왜 번거롭게 Integer(wrapper)타입을 썼냐? 제네릭은 (참조형)객체타입만 받을 수 있기 때문
        System.out.println(intContent + 1);
    }
}
