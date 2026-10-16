package com.ohgiraffers.section01.uses;

import java.util.Scanner;

public class MemberService {

    // 요청 처리 - 기능흐름 - 검색 등
    // 회원 등록, 조회, 검색

    /*
    * Service는 회원 등록, 조회, 검색 등 프로그램의 기능을 처리한다.
    * */

    public void signUpMembers() {
//        Member[] members = new Member[3];
        Member[] members = {
                new Member(1, "user01", "pass01", "판다", 3),
                new Member(2, "user02", "pass02", "코알라", 2),
                new Member(3, "user03", "pass03", "원숭이", 5)
        };
        if(MemberRepository.store(members)) {
            System.out.println("총" + members.length + "명의 회원 등록 성공!!");
        } else {
            System.out.println("정원 초과로 등록 실패!");
        }
    }

    // 전체 회원 조회 - Repository로부터 회원 정보를 받아와서 출력
    public void showAllMembers() {
        Member[] allMembers = MemberRepository.findAllMembers();

        for(Member member : allMembers) {
            if(member !=null) {
                System.out.println(member.getInformation());
            }
        }
    }

    // 회원 아이디로 회원 검색
    public void searchMemberById(Scanner sc) {

        // 검색할 아이디 입력받기
        System.out.println("검색할 아이디를 입력하세요 : ");
        String searchId = sc.nextLine();

        // Repository에서 모든 회원 정보를 가져온다. (객체 배열 return)
        Member[] foundMembers = MemberRepository.findAllMembers();

        // 검색 결과를 찾았는지 여부를 확인하기 위한 변수 선언
        boolean isFound = false;

        for(Member member : foundMembers) {
            if(member != null) {    // nullpoinexception 가능성 배제하기위해
                if (searchId.equals(member.getId())) {  // 일치하면 true, 아니면 false
                    System.out.println(" ---- 검색 결과 ----");
                    System.out.println(member.getInformation());

                    isFound = true;
                    break;  // 찾았다면 반복문 빠져나오기 - 계속 반복할 이유가 없음
                }
            }
        }
        if(!isFound) {
            System.out.println("해당 아이디 회원을 찾을 수 없습니다.");
        }



    }

}
