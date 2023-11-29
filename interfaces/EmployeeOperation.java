package interfaces;

import classes.Employee;

public interface EmployeeOperation {

    public Employee getEmployee(String NId);

    void insertEmployee(Employee e);

    void removeEmployee(Employee e);

    void showAllEmployee();

}