package com.ohgiraffers.section02.preparedstatement;

import java.sql.*;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("조회하실 메뉴 번호를 입력하세요 : ");
        String menuCode = sc.nextLine();
        /* ? : 위치 홀더- 값 하나가 들어가는 위치 홀더 */
        String query = "SELECT MENU_NAME, MENU_PRICE FROM TBL_MENU WHERE MENU_CODE = ?";

        try {
            pstmt = con.prepareStatement(query);              // 미완성된 문자열의 sql을 전달하고 prepareStatement 객체를 반환받음
            // sql 위치홀더 설정
            pstmt.setString(1, menuCode);                          // 2가지 값 전달 - parameterIndex, 문자열
            rset = pstmt.executeQuery();

            if(rset.next()) {
                System.out.println(rset.getString("MENU_NAME") + ", "
                    + rset.getInt("MENU_PRICE"));
            }   else {
                System.out.println("해당 메뉴의 조회 결과가 없습니다.");
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
