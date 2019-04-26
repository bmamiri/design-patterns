package structural.proxy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentDaoImpl implements DepartmentDao {
    private final DBConnection dbConnection;

    public DepartmentDaoImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public DBConnection getDbConnection() {
        return dbConnection;
    }

    @Override
    public void insertNewDepartment(int depId, String departmentName) throws SQLException {
        Connection connection = dbConnection.getConnection();
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement("insert into DEPARTMENTS VALUES (?,?)")) {
            preparedStatement.setInt(1, depId);
            preparedStatement.setString(2, departmentName);
            preparedStatement.executeUpdate();
        }
    }

    @Override
    public String queryDepartmentName(int depId) throws SQLException {
        Connection connection = dbConnection.getConnection();
        String result = null;
        try (PreparedStatement preparedStatement =
                     connection.prepareStatement("select department_name from DEPARTMENTS where department_id = ?")) {
            preparedStatement.setInt(1, depId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next())
                    result = resultSet.getString(1);
            }
        }
        return result;
    }
}
