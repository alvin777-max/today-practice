package com.ohgiraffers.section03.sqlinjection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {

    private static String empId = "210";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";   // sqlinjection 가능 - Statement는 이걸 방어할 수 없다. 문자열을 삽입해서 데이터 조회 가능해져버림

    public static void main(String[] args) {

        Connection con = getConnection();
        Statement stmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM employdb.EMPLOYEE WHERE EMP_ID = '" + empId + "' AND EMP_NAME = '" +empName + "'";
        System.out.println(query);

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            if(rset.next()) {
                System.out.println(rset.getString("EMP_NAME") + "님 환영합니다.");
            } else {
                System.out.println("회원 정보가 없습니다");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
