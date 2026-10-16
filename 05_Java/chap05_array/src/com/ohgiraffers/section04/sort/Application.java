package com.ohgiraffers.section04.sort;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        // num1 = num2;
        // num2 = num1;
        // 둘다 20이 됨
        // 값을 스왑하기 위해서 다른 변수에 값을 먼저 옮겨야함

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 : " + num1 + " num2 : " + num2);

        int[] arr = {2, 1, 3};

        int temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        System.out.println(Arrays.toString(arr));   // [1,2,3]
    }
}