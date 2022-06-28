package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class connect {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT", "root","");
        Statement statement = conn.createStatement();
        System.out.println("Database is connected ! ");
        conn.close();

    }catch (Exception e){
            System.out.println("Database was unable to connect");
            e.getStackTrace();
        }
    }
}
