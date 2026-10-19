package com.ohgiraffers.section04.properties;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {

        /*
        * [Properties]
        * 프로그램의 설정값은 코드에 직접 흩어 놓기보다
        * key=value 형태의 설정 파일로 관리할 수 있다.
        *
        * Map과 비슷한 key-value 구조에 저장과 로딩 기능을 더한 문자열 설정 도구이다.
        * key-value가 모두 String이어야만 한다.
        * 요즘은 yml형식을 많이 씀. 설정값을 저장해놓기 위한 용도
        * */

        String filePath = "src/com/ohgiraffers/section04/properties/application.properties";

        // .properties는 설정파일 - Key-value값으로 저장, 순서는 보장 안됨, 설정이라던가 파일로 빼낼것들 - properies
        Properties prop = new Properties();
        prop.setProperty("app.name", "fullstack-cours");    // map의 규칙과 똑같음
        prop.setProperty("app.version", "2.0");
        prop.setProperty("app.language", "ko");

        // try가 종료되고 close가 되면 파일 작성이 완료됨
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(filePath),
                StandardCharsets.UTF_8))     {  // OutputStreamWriter 자바를 UTF-8로 만들어줌 // FileOutput 파일로서 출력시키기 위한

            prop.store(writer, "application settings"); // ""는 코멘트

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Properties loadedProp = new Properties();

        try(Reader reader = new InputStreamReader(new FileInputStream(filePath),
        StandardCharsets.UTF_8))    {

            loadedProp.load(reader);    // reader로 내요을 읽어와서 loadedProp에 저장

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(loadedProp.getProperty("app.name"));
        System.out.println(loadedProp.getProperty("app.version"));
        System.out.println(loadedProp.getProperty("app.language"));
    }
}
