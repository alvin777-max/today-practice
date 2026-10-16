package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /* 향상된 for문
        * 인덱스를 직접 사용하지 않고 배열의 값을 처음부터 끝까지 하나씩 꺼내는 반복문
        * */

        // 일반 for문, toString
        // 인덱스 값 활용 필요 없음. 읽기만 할때 - 향상된 for문
        int[] arr = {1, 2, 3, 4, 5};

        /*
        * : 오른쪽의 배열을 : 왼쪽의 임시 변수에 '복사'해서 사용
        * value는 임시 변수이기 때문에 원본 배열에는 영향이 없다.
        * */

        // arr의 요소 하나들이 value(임시변수)에 담긴 후 출력됨. JS의 for of문과 비슷함
        // 배열 자체를 복사 X, int형이기에 배열의 각 숫자들만 '값 복사'해서 임시변수에 넣음 - 따라서 배열 자체는 복사된게 아님. -깊은복사 x

        for (int value : arr) {
            value += 10;
            System.out.println(value);
        }
        System.out.println(Arrays.toString(arr));   // 값에 변경 없음 - 향상된 for문은 원본 배열에 영향을 주지 않음

        for (int i =0; i < arr.length; i++) {
            arr[i] += 10;
        }
        System.out.println(Arrays.toString(arr));   // 일반 for문은 원본 배열에 영향을 줌
        // 배열의 특정 인덱스가 필요하거나, 요소 교체가 필요할때 - 일반 for문 사용

        /*
        * 향상된 for문 : 값을 '읽을' 목적일 때
        * 일반 for문 : 값을 '수정'할 목적일 때
        * */
    }
}
