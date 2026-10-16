package com.ohgiraffers.section01.list.run;

import java.util.ArrayList;
import java.util.List;

public class Application6 {
    public static void main(String[] args) {
        // 타입마다 메서드를 따로 만들어야함
        // 타입 제한을 풀면 아무타입이나 들어옴

        /*
        * [제네릭 와일드카드]
        * 호출할 때 들어오는 정확한 요소 타입은 달라도
        * 메소드가 허용할 타입의 범위를 정하는 문법
        * */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);

//        List<Number> numberList = integerList;  // 실제로 만들어진 List<Integer>과 List<Number> 간의 상속관계가 성립되지 않음
        printAnyList(integerList);
        printAnyList(doubleList);

        System.out.println("정수 합계 : " + sum(integerList));
        System.out.println("실수 합계 : " + sum(doubleList));

        List<Number> numberList = new ArrayList<>();
        addInteger(numberList);
        System.out.println(numberList);
        System.out.println("numberList = " + numberList);
    }
    private static void printAnyList(List<?> list) {

        for (Object value : list) {
            System.out.println(value);
        }
    }

    // Number 계열의 값을 '읽는'데 유리
    private static double sum(List<? extends Number> list) {    // Number은 Integer, Double같은 wrapper 타입의 부모. Number & Number의 자식들만 받기
        // String 같은 값을 못들어오게 막음
       double total = 0;

        for (Number number : list) {
            total += number.doubleValue();  // Integer / Double(객체 - 수학적 연산 불가) ->double(기본 자료형)로 바꿈
        }
        return total;
    }

    // 값을 받아서 '저장'하는데 유리
    private static void addInteger(List<? super Integer> list) {    // 부모를 가리키는 키워드 - Integer과 Integer의 부모인 애들
        // Object - Number - Object
        list.add(100);  // 꺼낸값은 Object값으로만 읽을 수 있음
    }
}
