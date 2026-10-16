package com.ohgiraffer.section06.statickeyword;

public class Application {

    /*
    * [static]
    * static 멤버는 특정 객체가 아니라 클래스에 속한다.
    * 객체를 생성하지 않고 클래스 이름으로 접근할 수 있으며 모든 인스턴스(객체)가 하나를 공유한다.
    * */

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1.getPersonalLockerCount());
        System.out.println(student1.getSharedLockerCount());

        student1.increasePl();
        student1.increaseSL();

        System.out.println(student1.getPersonalLockerCount());
        System.out.println(student1.getSharedLockerCount());

        Student student2 = new Student();
        System.out.println(student2.getPersonalLockerCount());
        System.out.println(student2.getSharedLockerCount());

        student1.increasePl();
        student1.increaseSL();

        System.out.println(student2.getPersonalLockerCount());
        System.out.println(student2.getSharedLockerCount());


    }

    // non-static 필드 : "개인 사물함"
    // new 로 객체를 만들 때마다 Heap에 새로 생성되며, 객체마다 독립적이다.
    private int personalLockerCount;

    // static 필드: "공용 사물함"
    // 프로그램 시작 시 static 영역에 단 하나만 생성되며, 모든 객체가 공유한다.
    private static int sharedLockerCount;
}
