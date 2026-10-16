package com.ohgiraffers.section02.superkeword;

public class Computer extends Product{

    // 자식 클래스만의 필드만 정의해주면 됨
    private String cpu;
    private int ram;

    public Computer() {
        super();    // 부모의 기본 생성자 선택해서 호출 - 생략해도 컴파일러가 자동사용
        System.out.println("Computer 기본 생성자 호출");
    }

    // Alt + insert - 생성자로 편하게 생성 가능
    // 부모와 자식 필드를 모두 초기화 하는 생성자
    public Computer(String code, String name, int price, String cpu, int ram) {
//        this.code = code;
//        this.name = name;
        //code, name, price는 private 필드로 설정했기에 접근 불가능 - 부모클래스의 생성자 이용
        super(code, name, price);
        this.cpu = cpu;
        this.ram = ram;
        System.out.println("Computer 클래스의 부모 필드도 초기화하는 생성자 호출");
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String getInformation() {
        String parentInfo = super.getInformation();   // 그냥 getInformation이라고 뜨면 자기 자신을 호출하는것이 반복 - stackoverflow발생
        String computerInfo = " " + cpu + " " + ram;
        return parentInfo + computerInfo;
    }


}
