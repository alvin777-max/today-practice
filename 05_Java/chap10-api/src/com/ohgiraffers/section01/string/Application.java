package com.ohgiraffers.section01.string;

import jdk.swing.interop.SwingInterOpUtils;

public class Application {
    public static void main(String[] args) {

        /* [String]
         * 문자열 처리 */

        String rawData = "      [PROD-001] Apple iPhone 16 Pro | a17 bionic | 2500000   ";
        System.out.println(rawData);    // [PROD-001] Apple iPhone 16 Pro | a17 bionic | 2500000

        // trim() :문자열의 앞/뒤 공백 제거
        String trimmedData = rawData.trim();
        System.out.println("trimmedData = " + trimmedData); // trimmedData = [PROD-001] Apple iPhone 16 Pro | a17 bionic | 2500000

        // toUpperCase() / toLowerCase() : 대/소문자 변환
        String upperData = trimmedData.toUpperCase();
        System.out.println("upperData = " + upperData); // upperData = [PROD-001] APPLE IPHONE 16 PRO | A17 BIONIC | 2500000

        /* indexOf() : 특정 문자/문자열의 위치(인덱스) 반환 - 없는 문자 찾을 시 -1 반환*/
        int opening = upperData.indexOf('[');
        int codeEnd = upperData.indexOf(']');

        System.out.println("여는 괄호 : " + opening);   // 0
        System.out.println("닫는 괄호 : " + codeEnd);   // 9

        /* substring(시작 인덱스, 끝 인덱스) : 문자열의 특정 구간을 잘라내어 새로운 문자열로 반환*/
        String productCode = upperData.substring(opening + 1,codeEnd);
        System.out.println("productCode = " + productCode);

        /* replace(): 문자열 내의 특정 문자(열)를 다른 문자(열)로 치환한 새로운 문자열 반환 */
        String replacedName = upperData.replace("IPHONE 16 PRO", "GALAXY S26");
        System.out.println("replacedName = " + replacedName);

        /* 문자열 생성 방식
        * 리터럴 방식
        * - String Constant Pool의 같은 문자열을 재사용
        *
        * new String() 방식
        * - 새로운 String 객체를 생성 */
        String str1 = "java";   // 리터럴: JVM이 String Constant Pool에 "java" 생성
        String str2 = "java";   // "java"를 또 만들지 않고(이미 SCP)에 있기 때문에 재사용 - 같은 객체를 가리킴
        String str3 = new String("java");   // new 키워드 - Heap 영역에 생성
        String str4 = new String("java");   // Heap 영역에 독립적으로 생성되기 때문에 서로 다른 객체임

        System.out.println(str1 == str2);   // true - 같은 객체를 가리킴
        System.out.println(str3 == str4);   // false - 서로 다른 객체를 가리킴
        // 문자열 생성방식에 따라서 (==)은 다른 결과를 도출하기에 equals를 사용해서 비교하는것이 정확하다.

        // String클래스도 object를 상속받고 있음 -> 이미 equals를 오버라이딩해서 제공함
        // 따라서 문자열 비교는 equals를 하는것이 안전하다
        System.out.println(str3.equals(str4));  // true - String 클래스에 동등성 비교를 하게끔 오버라이딩 되어 있다.

        // 사용자의 입력값을 받을 때 null처리를 해줘야함 따라서 사용자 입력문자열을 equals 뒤쪽에 넣어야함
        // 입력받기 전에 if문으로 분기하는것이 가장 안전한 방법
        // null에 안전한 문자열 비교
        String input = null;
        System.out.println("java".equals(input));   // false
//        System.out.println(input.equals("java"));   // NullPointerException - null을 기준으로 equls를 하면 발생

        /* 문자열은 '불변(immutable)' 객체이다
        * '+' 연산 등으로 문자열을 변경하면 기존 문자열이 수정되는 것이 아니라,
        * 새로운 문자열 객체가 생성되고 변수가 새 문자열을 가리키게 된다. */
        str2 += " mysql";   // str2 = str2 + " mysql"   // 원본이 "str2 mysql"로 변경된게 아니라 새로운 문자열이 생성되고 변수 str2가 새로 생성된 객체를 참조하게 됨
        System.out.println("str1 == str : " + (str1 == str2));  // false

        /* split() : 특정 구분자를 기준으로 문자열을 잘라 '문자열 배열'로 반환한다 */
        String emp = "100/홍길동/서울//교육부"; // //처럼 연속되면 빈 문자열이 나올 수 있음 - isEmpty 이용
        String[] empArr = emp.split("/");

        for(String info : empArr) {
            // .isEmpty() : 문자열의 길이가 0이면 true, 아니면 false 반환
            if (info.isEmpty()) {
                System.out.println("정보 없음");
            } else {
                System.out.println(info);
            }
        }

        /* 자바의 split()은 구분자를 정규식으로 해석한다. */
        String fileName = "report.final.pdf";
        String[] fileNameParts = fileName.split("\\.");
        for(String part: fileNameParts) {
            System.out.println(part);
        }
        /*
        * 이스케이프 문자
        * 문자열 내에서 줄바꿈, 탭, 따옴표 등 특별한 기능을 하는 문자, 역슬래시(\)로 시작한다.
        * \n (줄바꿈), \t (탭), \" (쌍따옴표), \' (홑따옴표), \\ (역슬래시)
        * */

    }
}
