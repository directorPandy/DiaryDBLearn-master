package com.diary.db;

import java.sql.*;

public class Connector {

    final String user = "postgres";
    final String password = "Lortunib182";
    final String url = "jdbc:postgresql://localhost:5432/postgres";


    static Connection connection;

    public Connection connect() {
        try {
            System.out.println("Creating connection to DB...");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } return  connection;
    }

    public Connection disconnect() {
        try {
            System.out.println("Disconnecting from DB....");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } return  connection;
    }
}





