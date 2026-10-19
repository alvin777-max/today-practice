package com.ohgiraffers.section03.filterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application2 {
    public static void main(String[] args) {

        /*
        * 형변환 보조스트림(InputStreamReader / OutputStreamWriter)
        * - byte 기반 스트림을 char 기반 스트림으로 연결할 때 사용
        * - System.im은 키보드 입력을 바이트 단위로 받는 inputStream 이다.
        * - inputStreamReader는 그 바이트를 문자로 해석해 Reader로 바꿔준다.
        * - BufferedReader는 Reader를 감싸서 버퍼 기능과 readLine()을 제공한다.
        * */

        // System.in: 키보드와 연결된 input스트림:byte기반 -> inputStreamReader(바이트를 문자로 변환) -> BufferedReader(readLine() 제공) -> 프로그램의 String
        // 키보드의 byte를 문자열로 변경하는 중간과정 필요

        // scanner의 바이트로 받아오던걸 문자열로 받아오고 버퍼를 이용 -> 효율 최적화
        // 기본 환경에 맞춰서 입력받도록 문자셋을 지정하지는 않았음
        // String으로 반환함
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.print("문자열 입력 : ");
            String value = br.readLine();

            System.out.println("value = " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
