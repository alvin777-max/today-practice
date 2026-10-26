package org.example.section02.template;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {

    public static Connection getConnection() {

        Connection con = null;
        Properties prop = new Properties();

        try (FileReader reader = new FileReader("src/main/java/org/example/config/jdbc-config.properties")) {
            prop.load(reader);

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");

            Class.forName(driver);

            con = DriverManager.getConnection(url,prop);    // user, password를 사용하려면 getproperties로 꺼내와야함 // 그냥 property 객체를 추가해도 됨. 단 property에서 변수명을 정해진대로 정해야함


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 지금은 연결객체를 반환만 하고 있음 반납은 이 메서드를 호출하는 쪽에서 하게 함
        return con;
    }

    // close도 메서드로 만들어줌 - 반복코드 줄임
    public static void close(Connection con) {
        try {
            if(con !=null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


