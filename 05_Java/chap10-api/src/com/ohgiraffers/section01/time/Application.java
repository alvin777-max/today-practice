package com.ohgiraffers.section01.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        /*
        * java.time 패키지의 주요 클래스
        *
        * LocalDate : 날짜
        * LocalTime : 시간
        * LocalDateTime : 날짜 + 시간
        * 국가별 시간대가 필요한 서비스는 ZonedDateTime과 ZoneId를 사용한다.
        * */

        LocalDate departureDate = LocalDate.of(2026, 10, 14);   // 스태틱 메서드들임
        LocalTime departureTime = LocalTime.of(14,30);

        LocalDateTime trainDeparture = LocalDateTime.of(departureDate, departureTime);
        System.out.println("기차 출발 시각 = " + trainDeparture);

        // 현재 날짜와 시간
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시각 = " + now);

        System.out.println(trainDeparture.getYear());
        System.out.println(trainDeparture.getMonth());
        System.out.println(trainDeparture.getMonthValue());
        System.out.println(trainDeparture.getDayOfWeek());

        /* plus...(), minus...() 이용하여 시간계산을 할 수 있다.
         * Java.time 객체는 불변이다. 원본 객체를 변경하지 않고 계산된 새로운 객체를 반환한다
         * 따라서 반환값을 변수에 저장해야 계산 결과를 사용할 수 있다. */
        LocalDateTime arrivalDeadLine = trainDeparture.minusMinutes(20);
        System.out.println("arrivalDeadLine = " + arrivalDeadLine);
        System.out.println(trainDeparture);

        /* 날짜 비교하기 isBefore(), isAfter(), isEqual()- 불리언 값 반환 */
        boolean isPast = trainDeparture.isBefore(now);  //기차 출발시간이 현재시간보다 전인가?
        System.out.println("기차 떠났나요? " + isPast);   // false

        /* 포매팅
        * DateTimeFormatter를 사용하면 날짜/ 시간 객체를 원하는 형식의 문자열로 변환하거나,
        * 특정 형식의 문자열을 날짜/ 시간 객체로 변환할 수 있다.*/

        // Format : LocalDateTime -> String
        // 1. 원하는 출력 형식의 패턴을 만든다.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 출발");
        // 2. 날짜 객체에 format() 메소드를 호출하며 패턴을 전달한다.
        String ticket = trainDeparture.format(formatter);
        System.out.println("ticket = " + ticket);

        /* Parse: String -> LocalDate*/
        String christmas = "20261225";      // yyyyMMdd 형식의 문자열 - 날짜 타입으로 변환 가능한 값이어야함
        // 1. 분석할 문자열의 패턴을 만든다
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("yyyyMMdd");
        // 2. LocalDate.parse() 메소드를 호출하여 문자열과 패턴 전달
        LocalDate parsedDate = LocalDate.parse(christmas, parser);
        System.out.println("parsedDate = " + parsedDate);   // 전달한 문자열이 날짜 타입으로 변환됨

    }
}
