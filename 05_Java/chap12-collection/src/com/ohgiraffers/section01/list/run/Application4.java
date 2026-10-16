package com.ohgiraffers.section01.list.run;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application4 {
    public static void main(String[] args) {

        /*
        * Stack
        * - 후입선출(LIFO) 방식의 자료구조이다.
        *
        * - 웹 브라우저의 '뒤로 가기' 기능
        * - 프로그램의 '실행 취소' 기능
        *
        * 자바에 오래된 Stack 클래스도 있지만, 현재는 Deque 인터페이스의 구현체인
        * ArrayDeque를 스택처럼 사용하는 방식이 일반적이다.
        * Deque는 양쪽 끝에서 값을 넣고 뺼 수 있자만 여기서는 한쪽 끝만 사용한다. */

        Deque<Integer> integerstack = new ArrayDeque<>();   // 상위 인터페이스인 Deque로 다형성 적용

        // List - add메서드
        // Deque - push 메서드

        integerstack.push(1); // int -> Integer 오토박싱
        integerstack.push(2);
        integerstack.push(3);
        integerstack.push(4);
        integerstack.push(5);

        System.out.println(integerstack);

        /*
        * peek() : 가장 꼭대기 요소를 '확인'
        * pop() : 가장 꼭대기 요소를 '꺼내고' 제거한다.
        * */

        System.out.println("peek(): " + integerstack.peek());   // peek(): 5
        System.out.println(integerstack);   // [5, 4, 3, 2, 1]
        System.out.println("pop(): " + integerstack.pop());     // pop(): 5
        System.out.println(integerstack);   // [4, 3, 2, 1]

        while(!integerstack.isEmpty()) {    // isEmpty() -> 비어있으면 true, 아니며 false 반환
            System.out.println("꺼낸 값 : " + integerstack.pop());
        }

        // 비어있는 경우(stack의 경우), que는 null을 반환
//        System.out.println(integerstack.pop()); // .NoSuchElementException - 익셉션 발생


    }
}
