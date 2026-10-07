package com.ohgiraffers.section03.copy;

public class Application {
    public static void main(String[] args) {

//        int value = 5;      // 5라는 값 자체가 변수에 들어감
//        int value2 = value; // 여기도 같음

        // 배열안에 들어가있는 값이 기본형일때는 얕은복사
        // 배열안에 배열(참조값을 가지고 있는 것들) 일때는 무조건 얕은복사는 아님
        int[] originArr = {1, 2, 3, 4, 5};

        // 얕은 복사

        int[] copyArr = originArr;

        /*
        * [얕은 복사]
        * 얕은 복사가 일어난다
        * 배열 자체가 복사되는 것이 아니라 배열을 가리키는 참조 값이 복사되므로
        * copyArr의 요소를 바꾸면 originArr에서도 값이 변경된다.
        * 메소드에 인자로 배열을 전달하거나, 메소드가 배열을 반환할 때 발생
        * JAVA가 메모리 효율적으로 사용하기 위함
        * */

        System.out.println("같은 배열인가?"+ (originArr == copyArr)); // true - 얕은복사가 됨. 참조값을 복사해서 가져옴

        System.out.println(originArr[4]);   // 5
        copyArr[4] = 80;
        System.out.println(originArr[4]);   // 80 - 원본 배열의 값이 80으로 바뀜

        // originArr과 copyArr은 같은 객체를 가리킴(참조값을 복사했기때문에)
        // 따라서 복사본을 변경해도 원본에 영향이 감



    }
}
