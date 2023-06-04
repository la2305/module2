package ss19_case_study.respository.implement;

import ss19_case_study.model.customer.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getAll();
    void addEmployee (Employee employee);
    void getByName(String name);
    void removeEmployee(Employee employee);
    Employee getByIdEmployee(String id);

    void editEmployee();
}
