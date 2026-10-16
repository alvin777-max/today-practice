package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application {
    public static void main(String[] args) {


        /*
        * 컬렉션 프레임워크
        * - 여러 개의 데이터(객체)를 효과적으로 관리하기 위해 자바에서 제공하는 클래스들의 묶음
        * - 크게 List, Set, Map 인터페이스로 분류된다.
        * */

        /*
        * ArrayList
        * - List 인터페이스의 가장 대표적인 구현 클래스
        * - 데이터에 순서(인덱스)가 있고, 중복된 데이터 저장을 허용한다. 배열 길이 미리 고정하지 않아도 됨
        * */


        List alist = new ArrayList();   // ArrayList의 상위타입인 List타입으로 참조변수 선언 - 다형성 활용
        // 자료구조가 선언되지 않았기에 여러가지 자료형을 담을 수 있음
        alist.add("apple");    // add 메서드를 사용해서 데이터를 추가
        alist.add(123);
        alist.add(45.67);
        alist.add((false));

        System.out.println(alist);  // [apple, 123, 45.67, false] - 추가한 순서대로 들어가짐
        // 여러타입을 제네릭 지정없이 넣을 경우 Object타입으로 취급되어 꺼낼 때 불편함

        // get메서드 사용해서 값을 꺼냄 - 인덱스번호 전달
//        String fruit = alist.get(0);    // java.lang.Object cannot be converted to java.lang.String - Object 타입으로 취급됨

        // 제네릭을 지정하지 않으면 리스트에 저장된 요소들이 Object로 취급된다
        // 따라서 값을 꺼내서 원래 타입으로 사용하려면, 매번 형변환을 해야 한다.
        String fruit = (String)alist.get(0);

        List<String> stringList = new ArrayList<>();    // 앞을 상위 인터페이스로 지정

        /* add(값): 마지막에 값 추가, size(인덱스, 값: 해당 위치에 값 추가 */
        stringList.add("apple");
//        stringList.add(123);    // 정수형은 넣을 수 없음
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("mango");

        System.out.println(stringList); // [apple, banana, orange, mango, mango]

        /* get(인덱스): 해당 위치의 값 조회 */
        System.out.println(stringList.get(0));  // apple

        /* set(인덱스, 값): 해당 위치의 값 수정 */
        stringList.set(0, "grape");
        System.out.println("변경 후 = " + stringList); // 변경 후 = [grape, banana, orange, mango, mango]

        /* remove(인덱스 또는 값): 해당 위치 또는 해당 값 삭제 */
        stringList.remove("orange");    
        System.out.println("삭제 후 = " + stringList); // 삭제 후 = [grape, banana, mango, mango]

        /* size() : 현재 저장된 요소 개수 확인 */
        System.out.println(stringList.size());  // 4

        // 문자열 목록 정렬하기

        /*
        * [Collections 클래스]
        * 컬렉션을 다루는데 유용한 static 메소드들을 제공하는 유틸리티 클래스 - import 필요
        * Collection 인터페이스와는 다르다
        * */

        // 오림차순 정렬
        Collections.sort(stringList);   // 원본을 정렬한다 - 정렬기준을 전달하지 않아도 문자열 정렬기준에 맞춰 정렬함
        System.out.println("정렬 후 stringList = " + stringList);  // 정렬 후 stringList = [banana, grape, mango, mango]


        // 내림차순 정렬
        // List 인터페이스에서 제공하는 sort 메소드에 Comparator.reverseOrder()를 인자로 전달
        stringList.sort(Comparator.reverseOrder()); // String의 기본정렬순서(오름차순)의 반대
        System.out.println("내림차순 정렬 stringList = " + stringList);   // 내림차순 정렬 stringList = [mango, mango, grape, banana]

        // 지금은 String형이라 정렬기준 전달하지 않았지만, 실제 객체가 들어갈 땐 정렬기준 전달해줘야함
    }
}
