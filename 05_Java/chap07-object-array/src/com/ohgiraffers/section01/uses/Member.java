package com.ohgiraffers.section01.uses;

public class Member {

    // 회원

    private int num;
    private String id;
    private String pwd; //데이터를 가지고 있는거랑 데이터를 외부에 보여주는것은 다른 문제
    private String name;
    private int age;

    public Member() {
    }

    public Member(int num, String id, String pwd, String name, int age) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInformation() {
        return id + " " + name + " " + age ;

    }
}
