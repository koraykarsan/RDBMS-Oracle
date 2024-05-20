package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

public class InsertBooks {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
    private static final String USER = "YOUR_USERNAME";
    private static final String PASSWORD = "YOUR_PASSWORD";
    private static final String INSERT_SQL = "INSERT INTO BOOK (ID, NAME, ISBN, CREATE_DATE) VALUES (?, ?, ?, SYSDATE)";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            connection.setAutoCommit(false);
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
                for (int i = 1; i <= 100; i++) {
                    preparedStatement.setInt(1, i);
                    preparedStatement.setString(2, generateRandomString(128));
                    preparedStatement.setString(3, generateRandomString(32));
                    preparedStatement.addBatch();
                }
                preparedStatement.executeBatch();
                connection.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static String generateRandomString(int length) {
        int leftLimit = 97;
        int rightLimit = 122;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }
}
