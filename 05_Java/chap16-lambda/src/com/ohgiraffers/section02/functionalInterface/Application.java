package com.ohgiraffers.section02.functionalInterface;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        /*
         * 자주 사용하는 함수형 인터페이스 - 추상 메서드가 단 하나 정의되어있음 - 람다식 사용 가능
         * 뭐를 받아서 뭐를 반환하는가를 생각하고 인터페이스 사용
         * Consumer<T>    : 값을 받아서 소비하고 반환값은 없음   - 추상메서드: accept()
         * Supplier<T>    : 값은 받지 않고 결과를 반환         - 추상메서드: get() - 매개변수 없이 람다식에 정의된 동작을 실행하고, 결과값을 반환하는 메서드
         * Function<T, R> : 값을 받아 다른 결과로 변환         - 추상메서드: apply(). UnaryOperator도 마찬가지
         * Predicate<T>   : 값을 받아 boolean 결과를 반환     - 추상메서드: test(매개변수의 자료형(제네릭타입) 매개변수 이름) -> boolean 값 반환
         * */

        // Consumer에는 추상 메서드가 accept() 하나뿐이다. 하지만 default 메서드는 추가로 존재할 수 있다.

        String input = "     java    ";

        Predicate<String> hasText = value -> value != null && !value.trim().isEmpty();  // null이 아니고 공백을 제거했을때 비어있지 않은지

        System.out.println(hasText.test(input));

        //  UnaryOperator<T> : 입력과 반환 타입이 같은 변환 - Function<T, T>를 상속받은 함수형 인터페이스 - 입력타입과 반환타입이 같다는걸 명확하게 표현하기 위해 사용
        // 인터페이스가 인터페이스를 extends로 상속받으면 메서드들(static,private 제외)을 코드로 작성하지 않아도 자동으로 상속됨

        // 람다식은 익명 클래스를 직접 만드는 문법은 아니지만, 함수형 인터페이스를 구현한 객체를 제공한다. 그 객체도 Object의 메서드를 사용할 수 있으므로 equals()를 호출할 수 있다.

        UnaryOperator<String> normalize = value -> value.trim().toUpperCase();
        String normalized = normalize.apply(input); // normalized = "JAVA"  // apply() - 람다식에 정의한 동작을 실행하고 결과를 반환하는 메서드 - <>의 반환타입에 맞춰짐

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
