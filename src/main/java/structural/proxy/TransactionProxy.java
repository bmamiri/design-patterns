package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TransactionProxy implements InvocationHandler {

    private DepartmentDao departmentDao;

    public TransactionProxy(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public static DepartmentDao createTransactionProxy(DepartmentDao departmentDao) {
        return (DepartmentDao) Proxy.newProxyInstance(departmentDao.getClass().getClassLoader(),
                departmentDao.getClass().getInterfaces(),
                new TransactionProxy(departmentDao));
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object invoke = method.invoke(departmentDao, objects);
        departmentDao.getDbConnection().getConnection().commit();
        return invoke;
    }
}
