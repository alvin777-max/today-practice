package com.ohgiraffers.section01.intenum;

public class Application {
    public static void main(String[] args) {


        int subject1 = Subjects.JAVA;   // 단순한 정수값이기에 과목을 넣어야한다는것을 모름 -> 이걸 타입으로 막아주는게 enum
        int subject2 = Subjects.HTML;

        if (subject1 == subject2) {             // 필드값만 봤을때는 다른값이지만, 같은 값이 들어가있기에 같은 과목으로 출력됨(변수 안에 들어있는 값이 중요)
            System.out.println("두 과목은 같은 과목입니다. ");
            // 문자열은 오타가 나도 저장될 수 있기에 -> 숫자상수로 but 숫자상수는 이와같은 값이 같을 수 있는 문제가 있음- >enum을 사용하면 정해진 값만 사용할 수 있음
        }

        printSubject(Subjects.MYSQL);
        printSubject(2);
        printSubject(100);  // 잘못된 값이지만 컴파일 되어버림 - 잘못된 값이 호출되는것을 컴파일 단계에서 막지 못함 - int 상수의 한계점


    }

    // 숫자에 이름을 붙였지만 실제 타입은 int형이기에 값이 충돌하거나, 잘못된 값이 들어올수도 있고, 모아볼 수도 없음
    public static void printSubject(int subjectNumber) {
        String subject = "";
        switch (subjectNumber) {
            case Subjects.JAVA: subject = "JAVA";
                break;
            case Subjects.MYSQL: subject = "MYSQL";
                break;
            case Subjects.JDBC: subject = "JDBC";
                break;
//            case Subjects.HTML:subject = "HTML";  // 값이 같아서 컴파일 오류가 남
        }
        System.out.println("전달받은 과목 : " + subject);
    }

}
