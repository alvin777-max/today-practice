package com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {

        // 자바의 배열은 같은 자료형만 저장 가능
        // 한번 배열을 생성한 후 길이를 바꿀 수 없음

        int score1 = 80;
        int score2 = 90;
        int score3 = 75;

        int sumOfScores = score1 + score2 + score3;
        double avgOfScores = sumOfScores / 3.0;

        System.out.println("합계: " + sumOfScores);
        System.out.println("평균: " + avgOfScores);

        int[] scores = new int[5];  // 길이 5의 int배열을 생성
//        int scores[] 위와 동일함

        // Application app = new Application();

        // new로 생성된 Application 객체는 Heap 영역에 생성된다.
        // app은 Stack 영역에 저장되는 참조변수이고, Heap에 생성된 객체를 가리키는 참조값을 가지고 있다.

        scores[0] = 80;
        scores[1] = 90;
        scores[2] = 75;
        scores[3] = 90;
        scores[4] = 100;

        int sum2 = 0;
        for(int i = 0; i < scores.length; i++) {
            sum2 += scores[i];
        }
        double avg2 = sum2 / (double)scores.length; // 배열의 길이값이 정수로 반환되기 때문에

        System.out.println(sum2);
        System.out.println(avg2);
    }
}
