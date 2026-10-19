package com.ohgiraffers.section02.functionalInterface;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        /*
         * 자주 사용하는 함수형 인터페이스 - 추상 메서드가 단 하나 정의되어있음 - 람다식 사용 가능
         * 뭐를 받아서 뭐를 반환하는가를 생각하고 인터페이스 사용
         * Consumer<T>    : 값을 받아서 소비하고 반환값은 없음
         * Supplier<T>    : 값은 받지 않고 결과를 반환
         * Function<T, R> : 값을 받아 다른 결과로 변환
         * Predicate<T>   : 값을 받아 boolean 결과를 반환
         * */

        // Consumer에는 추상 메서드가 accept() 하나뿐이다. 하지만 default 메서드는 추가로 존재할 수 있어.

        String input = "     java    ";

        Predicate<String> hasText = value -> value != null && !value.trim().isEmpty();  // null이 아니고 공백을 제거했을때 비어있지 않은지

        System.out.println(hasText.test(input));

        //  UnaryOperator<T> : 입력과 반환 타입이 같은 변환
        UnaryOperator<String> normalize = value -> value.trim().toUpperCase();
        String normalized = normalize.apply(input); // normalized = "JAVA"

        Consumer<String> printer = value -> System.out.println("처리결과: " + value);
        printer.accept(normalized);

        // Function<T, R> : 입력과 반환 타입이 다른 변환
        Function<String, Integer> length = value -> value.length();
        System.out.println(length.apply(normalized));

        Supplier<String> defaultValue = () -> "GUEST";
        String blankInput =  "     " ;
        String result = hasText.test(blankInput) ? normalize.apply(blankInput)  : defaultValue.get();

        printer.accept(result);
    }
}
