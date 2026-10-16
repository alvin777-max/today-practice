package com.ohgiraffers.section05.typecasting;

public class Application {
    public static void main(String[] args) {

        /* 자동 형변환 규칙
        *
        * - 서로 다른 숫자 타입을 연산하면 자바가 두 값을 함께 계산할 수 있는 타입으로 맞춘다
        * - 일반적으로 표현 범위가 더 넓은 타입으로 자동 변환한 뒤 연산한다.
        * */

        /* 표현 범위가 더 넓은 숫자 자료형으로는 자동 형변환 */
        // byte (1B) -> short (2B) -> int (4B) -> long (8B) -> float (4B) -> double (8B) 오른쪽으로 이동: 자동형변환
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 10;

//        int result1 = num1 + num2;
        // num1+ num2를 하면 더 큰 타입인 long타입이 되는데
        // 그 long타입의 값을 int(더 작은 타입)에 답을 수 없음

        long result1 = num1 + num2;
        /* 정수는 실수로 자동 형변환된다 */
        long eight = 8;
        float four = eight;

        System.out.println("four = " + four);   // 8.0

        /* 강제 형변환
        *  바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
        * (바꿀자료형) 값;
        * */

        // 큰자료형에서 작은 자료형으로 변경 시
        long lnum2 = 8;
//        int inum2 = lnum2;
        int inum2 = (int)lnum2;

        // 실수를 정수로 변경 시 강제 형변환 필요
        float fnum2 = 4.0f;
        long lnum3 = (long)fnum2;   // 데이터 손실을 감안할테니 형변환 해달라
        System.out.println("lnum3 = " + lnum3);
    }
}
