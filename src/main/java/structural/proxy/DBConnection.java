package structural.proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class DBConnection {
    private static final Logger LOGGER = Logger.getLogger(DBConnection.class.getName());
    private Connection connection;

    public DBConnection() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            LOGGER.severe(e.getMessage());
            throw new IllegalStateException("Please Load Database Driver", e);
        }
    }

    public Connection openConnection() throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_ON_EXIT=FALSE",
                "sa", "");
        connection.setAutoCommit(false);
        LOGGER.info("Connection established successfully.");
        try (Statement statement = connection.createStatement()) {
            statement.execute("create table IF not exists DEPARTMENTS (department_id integer not null, department_name varchar(255), primary key (department_id))");
        }

        return connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        if (connection != null) {
            connection.close();
            LOGGER.info("Connection Closed.");
        }
    }
}
