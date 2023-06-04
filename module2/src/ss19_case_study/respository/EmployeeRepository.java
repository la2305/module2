package ss19_case_study.respository;

import ss19_case_study.common.ReadAndWriteFile;
import ss19_case_study.model.customer.Employee;
import ss19_case_study.respository.implement.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employees = new ArrayList<>();
    private static final String FILE_PATH = "module2/src/ss19_case_study/data/Employee.csv";

    public List<Employee> getAll() {
        List<String> strings = ReadAndWriteFile.readFile(FILE_PATH);
        employees.clear();
        String[] info;
        for (String string : strings) {
            info = string.split(",");
            employees.add(new Employee(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8], Float.valueOf(info[9])));
        }
        return employees;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> strings = new ArrayList<>();
        strings.add(employee.getId() + "," + employee.getName() + "," + employee.getDate() + "," + employee.isGender() + "," + employee.getIdentityCardNumber() + "," + employee.getNumberPhone() + "," + employee.getEmail() + "," + employee.getLevel() + "," + employee.getPosition() + "," + employee.getSalary());
        ReadAndWriteFile.writFile(FILE_PATH, strings, true);
    }

    @Override
    public void getByName(String name) {
        employees = getAll();
        for (Employee employee : employees) {
            if (employee.getName().contains(name)) {
                System.out.println(employee);
            }
        }
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees = getAll();
        employees.remove(employee);
        List<String> strings = new ArrayList<>();
        for (Employee temp : employees) {
            strings.add(temp.getId() + "," + temp.getName() + "," + temp.getDate() + "," + temp.isGender() + "," + temp.getIdentityCardNumber() + "," + temp.getNumberPhone() + "," + temp.getEmail() + "," + temp.getLevel() + "," + temp.getPosition() + "," + temp.getSalary());
        }
        ReadAndWriteFile.writFile(FILE_PATH, strings, false);
    }

    @Override
    public Employee getByIdEmployee(String id) {
        employees = getAll();
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void editEmployee() {
        List<String> stringList = new ArrayList<>();
        for (Employee strings: employees) {
            stringList.add(strings.getId()+","+strings.getName()+","+strings.getDate()+","+strings.isGender()+","+strings.getIdentityCardNumber()+","+strings.getNumberPhone()+","+strings.getEmail()+","+strings.getLevel()+","+strings.getPosition()+","+strings.getSalary());
        }
        ReadAndWriteFile.writFile(FILE_PATH, stringList,false);
    }
}
