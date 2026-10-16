package com.ohgiraffers.section01.uses;

public class MemberRepository {

    // db 역활 - 저장, 반환
    // 회원 객체 배열 보관, 저장/ 조회

    //  책임분리해서 유지보수 편리화

    /*
    * Repository는 데이터를 저장하고 조회하는 역할을 담당한다.
    * 이후 데이터베이스를 배우면 이 역할을 데이터 베이스 접근 코드로 확장할 수 있다.*/

    // final을 붙여서 만들때는 초기화를 반드시 해줘야함
    private static final Member[] members;

    private static int count;   // int이므로 0으로 초기화되어있음

    // static 초기화 블럭 : MemberRepository 클래스가 처음 초기화 될 때 한 번 실행된다.
    static {
        members = new Member[10];
    }

    // 매개변수로 전달 받은 Member 객체 배열을 Repository의 members 배열에 저장
    public static boolean store(Member[] newMembers) {

        // 남은 공간보다 저장할 회원 수가 많으면 저장하지 않음
        if ( count + newMembers.length > members.length) {
            return false;
        }

        for(int i = 0; i < newMembers.length; i++) {
            members[count++] = newMembers[i];
        }
        return true;
    }

    /* 저장된 members 배열 반환 */
    public static Member[] findAllMembers() {
        return members; // 주소값 반환 - 반환하는 쪽에서 수정하면 원본 배열이 바뀜
    }
}
