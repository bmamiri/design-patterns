package structural.proxy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepartmentDaoTest {
    private static DBConnection dbConnection;
    private static DepartmentDao departmentDao;

    @BeforeAll
    public static void beforeClass() throws SQLException {
        dbConnection = new DBConnection();
        dbConnection.openConnection();
        departmentDao = new DepartmentDaoImpl(dbConnection);
    }

    @Test
    void insertNewDepartment() throws SQLException {
        DepartmentDao daoProxy = TransactionProxy.createTransactionProxy(departmentDao);
        daoProxy.insertNewDepartment(10, "Department 1");

        dbConnection.getConnection().rollback();
        assertEquals(departmentDao.queryDepartmentName(10), "Department 1");
    }
}