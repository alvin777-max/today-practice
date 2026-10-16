package com.ohgiraffer.section05.parameter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        /* 파라미터 전달 방식
         * 1. 값 복사(Pass by Value)
         * 2. 주소 복사(Pass by Reference)
         *  */

        MethodParameter mp = new MethodParameter();

        int num = 20;
        System.out.println("호출 전 main num : " + num);   // 호출 전 main num : 20
        mp.primitiveType(num);   // 전달받은 num :20, 변경 후 num : 99
        System.out.println("호출 후 main의 num : " + num); // 호출 후 main의 num : 20 - 값이 복사되는것을 알 수 있음


        int[] iarr = {1, 2, 3, 4, 5};
        System.out.println("호출 전 : " + Arrays.toString(iarr));
        mp.ArrayParameter(iarr);    //iarr에 저장된 참조값을 복사해서 전달
        System.out.println("호출 후 : " + Arrays.toString(iarr));  // 원본도 변경됨

        // 가변 인자 테스트
        mp.orderPizza("홍길동");
        mp.orderPizza("유관순", "불고기");
        mp.orderPizza("판다", "치즈", "페퍼로니", "올리브");
    }
}
