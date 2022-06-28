package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrieve {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306//NIIT", "root","");
            System.out.println("Database is connected ! ");

            String query = " select * from user";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                Boolean isMale = resultSet.getBoolean("isMale");

                System.out.printf("%-10s%-20s%-20s%-10s\n", id, name, email, isMale);
            }
            conn.close();

        }catch (Exception e){
            System.out.println("Database was unable to connect");
            e.getStackTrace();
        }
    }
}
