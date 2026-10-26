package com.ohgiraffers.section03.sqlinjection;

import java.sql.*;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    private static String empId = "210";
    private static String empName = "' OR 1=1 AND EMP_ID = '200";   // sqlinjection 가능 - Statement는 이걸 방어할 수 없다. 문자열을 삽입해서 데이터 조회 가능해져버림

    public static void main(String[] args) {

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        String query = "SELECT * FROM employdb.EMPLOYEE WHERE EMP_ID = ? AND EMP_NAME = ?";   // sql 구조가 변형되는것을 막아줌 - sql구조가 ?있는 상태로 준비가 됨. 바인딩 되는 ? 자리에 or등이 들어가지 못함
        System.out.println(query);

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);
            pstmt.setString(2, empName);

            rset = pstmt.executeQuery();


            if(rset.next()) {
                System.out.println(rset.getString("EMP_NAME") + "님 환영합니다.");
            } else {
                System.out.println("회원 정보가 없습니다");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
    }
}
