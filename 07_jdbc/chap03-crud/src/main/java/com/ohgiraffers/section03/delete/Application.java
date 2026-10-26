package com.ohgiraffers.section03.delete;

import com.ohgiraffers.model.dto.MenuDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        /* 메뉴 코드를 입력받아 해당 메뉴 삭제하기 */
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴 번호를 입력하세요 : ");
        int menuCode = sc.nextInt();

        MenuDTO deletedMenu = new MenuDTO();
        deletedMenu.setCode(menuCode);

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        int result = 0;

        try(FileInputStream queryStream = new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml")) {
            prop.loadFromXML(queryStream);
            String query = prop.getProperty("deleteMenu");

            pstmt = con.prepareStatement(query);

            pstmt.setInt(1, deletedMenu.getCode());


            result = pstmt.executeUpdate(); // DML 작업을 하면 DML 작업이 일어난 행의 수를 반환

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }
        if(result > 0) {
            System.out.println("메뉴 삭제 성공!");
        } else {
            System.out.println("메뉴 삭제 실패!");
        }


    }
}
