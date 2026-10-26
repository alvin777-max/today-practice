package org.example.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {


        /*
        * Connection
        * - 자바 어플리케이션과 DB사이에 만들어지는 연결통로
        * - DriverManager를 통해 DB 접속 정보를 전달하면 Connection 객체를 얻을 수 있다
        * */

        Connection con = null;

        // 사용할 JDBC Driver 클래스를 로딩한다
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // mysql driver를 사용하고 JVM이 로딩하게 됨 - 예외를 던지기에 try catch로 예외처리 해줘야됨

            // Drive Manager을 사용해서 connection 객체 생성
            // DriberManager.getConnection(url, user, password)
            con = DriverManager
                    .getConnection("jdbc:mysql://localhost/menudb", "ohgiraffers", "ohgiraffers");  // 얘도 SQLException이라는 얘외를 던짐

            System.out.println(con);    // com.mysql.cj.jdbc.ConnectionImpl@3c0be339 실제 메뉴 db라는 데이터베이스에 연결될 수 있는 Connection객체가 반환됨


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(con != null) {
                try {
                    if(!con.isClosed()) {
                        con.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
