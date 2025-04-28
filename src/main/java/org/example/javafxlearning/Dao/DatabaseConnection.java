package org.example.javafxlearning.Dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String url="jdbc:postgresql://localhost:5433/fruit_db";
    private static String user="postgres";
    private static String password="120999";
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}

