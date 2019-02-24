package structural.adapter;

import java.text.MessageFormat;

public class EmployeeDtoAdapter extends Employee {

    private EmployeeDto employeeDto;

    public EmployeeDtoAdapter(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    @Override
    public Long getId() {
        return employeeDto.getId();
    }

    @Override
    public String getCode() {
        return employeeDto.getCode();
    }

    @Override
    public String getFullName() {
        return MessageFormat.format("{0} {1}", employeeDto.getFirstName(), employeeDto.getLastName());
    }
}
