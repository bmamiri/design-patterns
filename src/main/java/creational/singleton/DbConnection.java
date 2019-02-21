package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String DB_DRIVER = "org.h2.Driver";
    private static final String DB_CONNECTION = "jdbc:h2:mem:test;";
    private static final String DB_USER = "";
    private static final String DB_PASSWORD = "";

    private Connection connection;

    private DbConnection() {
        initialConnection();
    }

    public static DbConnection getInstance() {
        return dbConnectionSingleton.INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }

    private void initialConnection() {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static class dbConnectionSingleton {
        private static final DbConnection INSTANCE = new DbConnection();
    }
}
