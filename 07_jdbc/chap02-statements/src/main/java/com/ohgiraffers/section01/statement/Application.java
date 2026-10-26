package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.common.JDBCTemplate.close;


public class Application {
    public static void main(String[] args) {

        // 트랜잭션 처리를 위한 DBMS 연동용 커넥션 객체 생성
        Connection con = getConnection();

        // 쿼리를 운반하고 결과를 반환하는 객체
        Statement stmt = null;
        ResultSet rset = null;

        // select 결과집합을 받아 올 용도의 인터페이스
        System.out.println(con);

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT MENU_NAME, MENU_PRICE FROM TBL_MENU");


            /* next() : ResultSet의 커서 위치를 하나 내리면서 행이 존재하면 true를 반환한다
            * getXXX(컬럼명) : 커서가 가리키는 행의 컬럼을 XXX 데이터 타입으로 반환한다
            * */
            while(rset.next()) { // next() - 커서가 다음행으로 가고 읽을 값이 있으면 true - 없으면 false
                System.out.println(rset.getString("MENU_NAME") + ", "   // 읽어올 값의 자료형과 같은 get자료형으로 읽어올 수 있음. 전달할 값은 실제 컬럼명
                        + rset.getInt("MENU_PRICE"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {                         // 맨 마지막에 연 애부터 닫아줌
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
