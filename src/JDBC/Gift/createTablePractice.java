package JDBC.Gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTablePractice {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_DB", "root","");
            Statement statement = conn.createStatement();
            statement.execute("create table Student (id int, first_name varchar(50), last_name varchar(50));");
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
