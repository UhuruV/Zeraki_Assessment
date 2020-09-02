package com.example.zerakiassessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DatabaseActivity {

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        Statement statement = null;

        createTable();
    }

    public static Connection getConnection() throws Exception {
        try {
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost/EDUCATION";

            final String STUDENT = "student";
            final String COURSE = "course";
            final String INSTITUTION = "institution";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(STUDENT,COURSE,INSTITUTION);
            System.out.println("Openning a connection");
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    public static void createTable() throws Exception{
        try{
            Connection conn=getConnection();
            assert conn != null;
            PreparedStatement create= conn.prepareStatement("CREATE TABLE IF NOT EXISTS education( id int NOT NULL AUTO_INCREMENT," +
                    "student varchar(255)," +
                    "course varchar(255)," +
                    "institution varchar(255)),PRIMARY KE(id)" +
                    "");
            create.executeUpdate();
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Table has been created!");
        }

    }
}
