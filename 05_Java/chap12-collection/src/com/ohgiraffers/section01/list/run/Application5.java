package com.ohgiraffers.section01.list.run;

import java.util.ArrayDeque;
import java.util.Queue;

public class Application5 {
    public static void main(String[] args) {

        /*
        * [Queue]
        * - 선입선출(FIFO)방식의 자료구조이다.
        * - Queue는 */

        Queue<String> queue = new ArrayDeque<>();

        // 데이터를 넣을 때는 offer()를 이용
        // offer() : 기존 대기열 맨 뒤에 값을 추가
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue);

        // peek() : 맨 앞의 요소를 '확인'
        System.out.println(queue);

        // poll() : 맨 앞의 요소를 '꺼내고' 제거한다.
        System.out.println("poll(): " + queue.poll());
        System.out.println(queue);

        queue.poll();
        queue.poll();   // 여기서 다 비움
        System.out.println(queue.poll());   // 큐가 비어있는 경우 null 반환


    }
}
