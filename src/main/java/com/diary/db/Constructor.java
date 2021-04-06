package com.diary.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Constructor {

    Connector connector = new Connector();
    Statement statement = null;
    Connection connection;
    String SQL;
    String paramName;
    Double id;

    public double generateId(){
        id = 20 + Math.random()*40;
        return id;
    }


    public void dataInsert(String SQL, String paramName) throws SQLException {
        try {
            this.SQL = SQL;
            this.paramName = paramName;
            connection = connector.connect();
            statement = connection.createStatement();
            statement.executeUpdate(SQL);
            System.out.println(paramName + " successfully created...");
        } finally {
            if (connection != null) {
                connection.close();
                System.out.println("Connections closed.");
            }
        }
    }

        public void tableInsert(int ID, String name, String spec, String SQL, String paramName) throws SQLException {
            try {
                this.SQL = SQL;
                this.paramName = paramName;
                connection = connector.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setInt(1, ID);
                preparedStatement.setString(2, name);
                preparedStatement.setString(3, spec);
                preparedStatement.executeUpdate();

                System.out.println(paramName + "successfully created...");
            } finally {
                if (connection != null) {
                    connection.close();
                    System.out.println("Connections closed.");
            }
        }
    }
}

