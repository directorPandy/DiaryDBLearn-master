package com.diary.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Harvester {

    static Connector connector = new Connector();
    static Statement statement = null;
    static Connection connection;

    public void teachersHarvest() throws SQLException {

        try {
            connection = connector.connect();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM teachers");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String speciality = resultSet.getString(3);
                System.out.println("ResultSet " + id + " " + name + " " + speciality);
            }
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public void studentHarvest() throws SQLException {
        try {
            connection = connector.connect();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String classRoom = resultSet.getString(3);
                System.out.println("ResultSet " + id + " " + name + " " + classRoom);
            }
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

        public void classHarvest() throws SQLException {
            try {
                connection = connector.connect();
                statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM class");

                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String number = resultSet.getString(2);
                    System.out.println("ResultSet " + id + " " + number);
                }
            } finally {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }
    }

