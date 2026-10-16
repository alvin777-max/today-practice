package com.ohgiraffers.section05.practice;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*
         * 중복 없는 로또 번호 6개 생성하기
         * 배열, 반복문, 조건문, Math.random(), 값 교환 사용
         * */

        // 1. 정수 6개를 저장할 배열을 만든다.
        int[] lotto = new int[6];


        // 다음 번호를 저장할 배열의 인덱스
        int index = 0;

        /* 2. 1부터 45까지의 난수를 하나 만든다.
         *     현재 배열에 먼저 들어간 값들과 차례로 비교한다.
         *     같은 값이 있으면 배열에 넣지 말고 새로운 난수를 다시 만든다.
         *     중복되지 않을 때만 배열에 저장하고 다음 인덱스로 이동한다.
         *
         * 힌트 : 배열에 몇 개를 저장했는지 나타내는 인덱스와
         *       중복 여부를 기억할 boolean 변수를 사용할 수 있다.
         * */

        while(index < lotto.length) {
            int randomNum = (int)(Math.random() * 45) + 1;

            boolean isDuplicate = false;

            for(int i = 0; i < index; i++) {
                if(lotto[i] == randomNum) {
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate) {
                lotto[index] = randomNum;
                index ++;
            }
        }


        // 3. 여섯 개를 모두 저장한 뒤 오름차순으로 정렬하고 출력한다. (어렵다면 sort 사용)
        for(int i = 0; i < lotto.length - 1; i++) {
            int minIndex = i;
            for(int j = i + 1; j < lotto.length; j++) {
                if(lotto[minIndex] > lotto[j]) {
                   minIndex = j;
                }
            }
            int temp = lotto[i];
            lotto[i] = lotto[minIndex];
            lotto[minIndex] = temp;
        }
        System.out.println(Arrays.toString(lotto));
    }
}
