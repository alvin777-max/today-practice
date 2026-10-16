package com.ohgiraffer.section03.dto;

public class Application {
    public static void main(String[] args) {

        // 관련 있는 값들을 하나로 묶어서 옮길 수 있게 만든 상자 -DTO
        // register(id, name, email...)로 전달하는게 아니라 MemberDTO 객체 하나만 전달하면 됨
        // 데이터를 포장해서 여러 객체에 나르는 상자 - 행동은 없음

        MemberDTO member = new MemberDTO();

        member.setNumber(1);
        member.setName("판다");
        member.setAge(5);
        member.setGender('여');
        member.setHeight(161);
        member.setActivated(true);

        System.out.println(member.getAge());
        System.out.println(member.getName());
    }
}
