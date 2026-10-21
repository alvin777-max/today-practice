package com.ohgiraffers.section03.reference;

import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        /*
         * [메소드 참조]
         * 람다가 새로운 동작을 만들지 않고 이미 존재하는 메소드 하나를 그대로 호출할 때
         * 그 호출을 클래스이름::정적메소드이름 형태로 간결하게 표현하는 문법이다.
         * */

        Function<String, Integer> parseInt = value -> Integer.parseInt(value);  // apply가 실행되야 호출됨

        parseInt.apply("123");
        System.out.println(parseInt.apply("123"));

        // 클래스이름::정적메소드이름
        Function<String, Integer> parseIntReference = Integer::parseInt;    // apply가 실행되야 호출됨

        System.out.println(parseIntReference.apply("123")); // apply로 받은 값이 Integer::parseInt의 매개변수로 전달되고 반환됨 - apply

        Consumer<String> printer = message -> System.out.println(message);  // 이미 존재하는 인스턴스 메서드에 전달됨

        Consumer<String> printerRefernece  = System.out::println;

        printer.accept("헬로 람다!");
        printerRefernece.accept("헬로 메소드참조!!!"); // accapt로 받을때 값이 들어감

        // BiPredicate<T, U> : 값 두개를 받아 boolean으로 반환
        BiPredicate<String, String> sameText = (left, right) -> left.equals(right); // 첫번째 인수가 equals를 호출할 객체, 두번째 인수가 매개변수가 됨

        BiPredicate<String, String> sameTextREference = String::equals; // String 클래스의 equals임

        System.out.println(sameText.test("hello", "hello"));    // 동등성 비교
        System.out.println(sameTextREference.test("hello", "world"));


        /* 생성자 참조 */

        Supplier<Account> newAccount = Account::new;
        Function<String, Account> newAccountWithName = Account::new;
        BiFunction<String, Integer, Account> newAccountFull = Account::new;     // 전달받는게 2개면 앞에 Bi를 붙여줌

        System.out.println(newAccount.get());
        System.out.println(newAccountWithName.apply("홍길동"));
        System.out.println(newAccountFull.apply("판다", 10000));

    }
}
