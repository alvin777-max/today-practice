package com.ohgiraffers.section03;

import java.io.IOException;

public class SuperClass {

    public void method() throws IOException {}  // 이 메서드를 호출하면 IOException이 발생할 수가 있다는 것을 알려줌. SuperClass를 상속받는 자식클래스에서 오버라이딩 시 범위를 뛰어넘으면 안됨
}
