package creational.singleton;

import java.sql.*;
import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbConnectionTest {

    @org.junit.jupiter.api.Test
    public void getInstance() {
        DbConnection dbConnection = DbConnection.getInstance();
        Connection connection = dbConnection.getConnection();
        System.out.println("Connection established");
        final String createQuery = "CREATE TABLE PERSON (id int primary key, name varchar(255))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        final String insertQuery = "INSERT INTO PERSON (id, name) VALUES (?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Mohammad Amiri");
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "Behzad");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        final String selectQuery = "SELECT COUNT(*) FROM PERSON";
        try (Statement query = connection.createStatement()) {
            try (ResultSet resultSet = query.executeQuery(selectQuery)) {
                if (resultSet.next()) {
                    System.out.println("The count is: " + resultSet.getInt(1));
                    assertEquals(resultSet.getInt(1), 2);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @org.junit.jupiter.api.Test
    public void performanceTest() {
        long time = System.currentTimeMillis();
        System.out.println(MessageFormat.format("Hash code is: {0}", DbConnection.getInstance()));
        System.out.println(System.currentTimeMillis() - time);

        time = System.currentTimeMillis();
        System.out.println(MessageFormat.format("Hash code is: {0}", DbConnection.getInstance()));
        System.out.println(System.currentTimeMillis() - time);
    }
}