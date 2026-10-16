package com.hw1.view;

import com.hw1.Controller.LibraryManager;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryMenu lm;
    Scanner sc;

    public void mainMenu() {

        System.out.print("이름 : ");
         String name = sc.nextLine();
        System.out.println("나이 : ");
         int age = sc.nextInt();
        System.out.println("성별 : ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name,age,gender);
        LibraryManager libraryManager = new LibraryManager();
        libraryManager.insertMember(mem);

        boolean isStop = false;
        while (!isStop) {

            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지 : ");
            System.out.println("2. 도서 전체 조회 : ");
            System.out.println("3. 도서 검색 : ");
            System.out.println("4. 도서 대여하기 : ");
            System.out.println("0. 프로그램 종료하기 : ");
            int chooseNum = sc.nextInt();
            switch(chooseNum) {
                case 1:
                    System.out.println(libraryManager.myInfo());
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    isStop = true;
                    break;


            }

        }
    }

   public void selectAll() {

   }

   public void searchBook() {

   }

   public void rentBook() {

   }

}
