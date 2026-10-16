package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        StudentDTO[] students = new StudentDTO[10];
        Scanner sc = new Scanner(System.in);

        boolean isFinish = false;
        int num = 0;

        while (num < students.length) {
            while (!isFinish) {
                students[num] = new StudentDTO();
                System.out.print("학년 : ");
                students[num].setGrade(sc.nextInt());
                System.out.print("반 : ");
                students[num].setClassroom(sc.nextInt());
                System.out.print("이름 : ");
                students[num].setName(sc.nextLine());
                sc.nextLine();
                System.out.print("국어점수 : ");
                students[num].setKor(sc.nextInt());
                System.out.print("영어점수 : ");
                students[num].setEng(sc.nextInt());
                System.out.print("수학점수 : ");
                students[num].setMath(sc.nextInt());
                sc.nextLine();
                System.out.print("계속 추가할 겁니까 ? (y/n) :");
                String yN = sc.nextLine();
                if (yN.equalsIgnoreCase("N")) {
                    isFinish = true;
                    for (int i = 0; i <= num; i++) {
                        System.out.println(students[i].getInformation());
                    }
                    return;
                } else if (yN.equalsIgnoreCase("Y")) {
                    num++;
                    if (num == students.length) {
                        return;
                    }
                }
            }
        }
    }
}
