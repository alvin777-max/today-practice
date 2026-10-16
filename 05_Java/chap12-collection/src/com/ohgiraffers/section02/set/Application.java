package com.ohgiraffers.section02.set;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // 중복 없는 값의 모음 - set
        // 몇번째 값을 꺼낸다는 개념이 없음 - 순번이 없음(인덱스 없음)


        /*
         * [Set]
         * - 순서를 보장하지 않는다
         * - 중복을 허용하지 않는다.
         *
         * HashSet          : 중복 제거, 순서 보장 X
         * LinkedHashSet    : 중복 제거 + 입력 순서 유지
         * TreeSet          : 중복 제거 + 비교 기준으로 정렬
         * */

        List<String> alist = new ArrayList<>();
        alist.add("java");
        alist.add("mysql");
        alist.add("java");

        Set<String> hset = new HashSet<>();
        // equals()가 이미 구현되어있음 - 같은 값이면 중복 허용하지 않고 값을 넣음
        // hashCode()가 객체의 해시코드를 계산해서 저장위치 찾음.
        // hashcode가 먼저 찾고, equals가 확인 - String class에서는 이미 오버라이딩해서 만들어놨음.
        hset.add("java");
        hset.add("html");
        hset.add("css");
        hset.add("java");


        System.out.println("ArrayList " + alist);   // ArrayList [java, mysql, java] - 중복 허용
        System.out.println("Hashset = " + hset);    // Hashset = [css, java, html] - 중복 허용 X, 우리가 넣은 순서 보장 X

        System.out.println("향상된 for문으로 순회");    // 인덱스가 없기에 향상된 for문 사용해서 전체값 출력
        for (String value : hset) {
            System.out.println(value);
        }

        System.out.println("Iterator로 순회");
        // iterator()를 호출하면 컬렉션을 순회할 수 있는 Iterator 객체를 반환한다
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()) {         //  hasNext() : 다음에 꺼낼 요소가 있다면 true
            System.out.println(iter.next());    // next(): 다음 요소를 꺼냄
        }
    }
}
