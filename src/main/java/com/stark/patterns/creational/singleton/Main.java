package com.stark.patterns.creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String args[]) {
        DbSingleton instance = DbSingleton.getInstance();

        long startTime = 0;
        long endTime = 0;

        startTime = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        Statement sta;
        try {
            sta = conn.createStatement();
            sta.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            System.out.println("Table created");
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        startTime = System.currentTimeMillis();
        Connection newConn = instance.getConnection();
        endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

    }
}
