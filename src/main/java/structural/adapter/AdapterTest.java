package structural.adapter;

import structural.adapter.dao.EmployeeDao;

public class AdapterTest {
    public static void main(String[] str) {
        EmployeeDao dao = new EmployeeDao();
        dao.save(new EmployeeDtoAdapter(new EmployeeDto()));
    }
}
