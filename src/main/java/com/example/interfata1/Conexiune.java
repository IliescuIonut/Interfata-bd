package com.example.interfata1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiune {
    private static final String URL = "jdbc:mysql://localhost:3306/proiect";
    private static final String USER = "root";
    private static final String PASSWORD = "test";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
