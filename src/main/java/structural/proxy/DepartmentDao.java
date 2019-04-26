package structural.proxy;

import java.sql.SQLException;

public interface DepartmentDao {
    DBConnection getDbConnection();

    void insertNewDepartment(int depId, String departmentName) throws SQLException;

    String queryDepartmentName(int depId) throws SQLException;
}
