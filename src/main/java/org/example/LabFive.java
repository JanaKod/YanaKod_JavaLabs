package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LabFive {
        public static void main(String[] args) {
            String url = "jdbc:sqlserver://localhost;encrypt=true;instanceName=DONKEY\\SQLEXPRESS;databaseName=students;integratedSecurity=true;";
            try {
                DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
                try (Connection conn = DriverManager.getConnection(url)) {
                    System.out.println("Got it!");
                }
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
}
