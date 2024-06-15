package org.example;

import java.sql.*;

public class Conect {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "nome", "senha");
    }

}


