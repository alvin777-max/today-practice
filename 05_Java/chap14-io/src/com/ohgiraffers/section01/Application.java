package com.ohgiraffers.section01;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        File file = new File("src/com/ohgiraffers/section01/test.txt"); // 생성자에 상대경로를 문자열로 전달
        // 이 경로를 가지고 있는 경로객체를 만듬(메모리에) - 실제로 파일이 만들어진것은 아님

        try {
            // 새 파일을 만들면 true, 이미 파일이 존재하면 false 반환
            boolean createSuccess = file.createNewFile();

            System.out.println(createSuccess);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("파일 크기 : " + file.length() + "byte");
        System.out.println("경로 : " + file.getPath());
        System.out.println("절대 경로 : " + file.getAbsolutePath());

        boolean deleteSuccess = file.delete();

        System.out.println(deleteSuccess);
    }
}
