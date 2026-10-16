package com.ohgiraffer.section06.statickeyword;

public class Student {

    // non-static 필드 : "개인 사물함"
    // new 로 객체를 만들 때마다 Heap에 새로 생성되며, 객체마다 독립적이다.
    private int personalLockerCount;

    // static 필드: "공용 사물함" - class에 속함
    // 프로그램 시작 시 static 영역에 단 하나만 생성되며, 모든 객체가 공유한다.
    private static int sharedLockerCount;

    public int getPersonalLockerCount() {
        return this.personalLockerCount;
    }

    public int getSharedLockerCount() {
        return Student.sharedLockerCount;
    }

    public void increasePl() {
        this.personalLockerCount++;
    }
    public void increaseSL() {
        Student.sharedLockerCount++;  // class명.필드명을 사용해야함 - 객체 없이 생성되기 때문에 this가 존재하지 않음
    }
}
