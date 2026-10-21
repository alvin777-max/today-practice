package com.ohgiraffers.section01.intro;

public class Application {
    public static void main(String[] args) {
        // Comparator      -  @Overide compare -> return num1 - num2; 실제 필요한 동작은 return문의 한줄
        // 한줄짜리 동작을 위해서 인터페이스, 객체 생성, 오버라이딩 해야됨
        // 구현해야하는 추상메서드가 딱 하나인 인터페이스 -> 람다식

        /*
        * [람다식]
        * 하나의 추상 메소드를 가진 함수형 인터페이스의 구현을
        * 간결하게 표현하는 문법이다.
        *
        * 매개변수와 실행할 동작만 작성한다.
        * (매개변수) -> { 실행할 코드 }
        * */

        /* 익명 클래스 덧셈 */
        // 구현한 애들을 재사용할 필요 X -> 익명 클래스 사용
        Calculator anonymousAdd = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println("익명 클래스 덧셈 :" + calculate(10, 19, anonymousAdd));

        Calculator lambdaAdd = ( a, b) -> a + b;    // 컴파일러가 calculator가 인터페이스이고 추상 메서드가 하나인걸 앎. -> 오른쪽의 수행동작을 한다는것을 앎
        System.out.println("람다: " + lambdaAdd.operate(10,19));
        System.out.println("람다식 덧셈 : " + calculate(10, 19, lambdaAdd));

        calculate(10,19, (a,b) -> a - b);   // 람다식 자체를 전달
        calculate(10, 19, (a,b) -> a * b);

        int bonus = 5;  // 람다가 선언된 자리에서 지역변수 값을 가져가서 나중에 사용할 수도 있기 때문에, 람다식이 참조하고 있는 지역변수는 처음에 정한뒤에 재대입 불가하게 막음
        Calculator bonusCalculator = (int a, int b) -> a + b + bonus;
//        bonus = 10; // 람다가 참조하는 지역변수는 처음 정한 뒤 다시 대입할 수 없다. (바로 윗줄의 bonus)에서 컴파일 에러가 발생

        /*
        * 람다는 선언된 자리에서 지역 변수의 값을 가져가 나중에 실행될 수도 있다.
        * 그 사이 지역 변수 값이 계속 바뀐다면 람다가 어느 값을 사용해야 하는지 흐름을 이해하기 어려워진다.
        * 이러한 혼란을 막기 위해 자바는 람다가 참조하는 지역변수는 처음 정한 뒤 다시 대입하지 못하게 한다.
        * */
        System.out.println(calculate(10, 20, bonusCalculator));
    }

    public static int calculate(int first, int second, Calculator calculator) {
        return calculator.operate(first, second);   // 입력값에 대한 검증, 로그로 남김 등 모든 계산에 대한 과정을 남길 수 있음 - 현재는 없어도 bonusCalculator.operate 형식으로 사용 가능
    }
}
