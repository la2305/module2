package ss19_case_study.service;

import ss19_case_study.common.Regex;
import ss19_case_study.model.customer.Employee;
import ss19_case_study.respository.EmployeeRepository;
import ss19_case_study.respository.implement.IEmployeeRepository;
import ss19_case_study.service.implement.IEmployeeService;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayAll() {
        List<Employee> employees = employeeRepository.getAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {


        // id of employee
        String id;
        do {
            System.out.println("Enter the id of new employee");
            id = scanner.nextLine();
            if (!Regex.validIdEmployee(id)) {
                System.err.println("Enter Id with format: NV-YYYY (with Y is number)");
            } else {
                break;
            }
        } while (true);


        //name of employee
        String name;
        do {
            System.out.println("Enter the name of new employee");
            name = scanner.nextLine();
            if (!Regex.validName(name)) {
                System.err.println("Capitalize the first letter of each word");
            } else {
                break;
            }
        } while (true);


        //date of employee
        String date = "";
        do {
            try {
                System.out.println("Enter the date of birth of new employee");
                date = scanner.nextLine();
                int year = Integer.parseInt("" + date.charAt(0) + date.charAt(1) + date.charAt(2) + date.charAt(3));
                int month = Integer.parseInt("" + date.charAt(5) + date.charAt(6));
                int day = Integer.parseInt("" + date.charAt(8) + date.charAt(9));
                LocalDate bithday = LocalDate.of(year, month, day);
                LocalDate today = LocalDate.now();
                int age = Period.between(bithday, today).getYears();
                if (Regex.vallidDateOfBirth(date) && age >= 18) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Enter the date of birth with format YYYY-MM-DD");
            } catch (Exception e) {
                System.out.println("Enter the date of birth with format YYYY-MM-DD");
            }
        } while (true);


        //gender of employee
        int choice;
        boolean gender = true;
        do {
            System.out.println("Enter the gender of new employee");
            System.out.println("1. Male");
            System.out.println("2. Female");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                gender = true;
            } else if (choice == 2) {
                gender = false;
            } else {
                System.err.println("Enter 1 or 2");
            }
        } while (choice != 1 && choice != 2);


        //identity card number
        String identityCardNumber = "";
        do {
            System.out.println("Enter the identity card number of new employee");
            identityCardNumber = scanner.nextLine();
            if (Regex.validIdentityCardNumber(identityCardNumber)) {
                break;
            } else {
                System.err.println("Enter your 9 or 12 digit ID card number");
            }
        } while (true);


        //phone number
        String numberPhone = "";
        do {
            System.out.println("Enter the number phone of new employee");
            numberPhone = scanner.nextLine();
            if (Regex.validNumberPhone(numberPhone)) {
                break;
            } else {
                System.out.println("number phone must start with 0 and have 10 number");
            }
        } while (true);

        //email
        System.out.println("Enter the email of new employee");
        String email = scanner.nextLine();

        //level
        String level;
        do {
            System.out.println("Enter the level of new employee");
            level = scanner.nextLine();
            if (Regex.checkLevel(level)) {
                break;
            } else {
                System.out.println("Enter the level of new new employee with format: Trung cấp, Cao đẳng, Đại học, Sau đại học");
            }
        } while (true);

        //position
        String position = "";
        do {
            System.out.println("Enter the position of new employee");
            position = scanner.nextLine();
            if (Regex.checkPosition(position)) {
                break;
            } else {
                System.out.println("Enter the position of new employee with format: Lễ tân, Phục vụ, Chuyên viên, Giám sát, Quản lý, Giám đốc");
            }
        } while (true);


        //salary
        float salary = 0;
        do {
            try {
                System.out.println("Enter the salary of new employee, salary must be greater than 0");
                salary = Float.valueOf(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Enter a Number");
            }
        } while (salary <= 0);


        Employee employee = new Employee(id, name, date, gender, identityCardNumber, numberPhone, email, level, position, salary);
        employeeRepository.addEmployee(employee);
        System.out.println("Add employee complete");
    }

    @Override
    public void findNameEmployee() {
        System.out.println("Enter name of employee you want to search");
        String name = scanner.nextLine();
        employeeRepository.getByName(name);
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Enter id of employee you want to delete");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getByIdEmployee(id);
        if (employee == null) {
            System.out.println("Find not employee with id: " + id);
        } else {
            System.out.println("Are you sure delete employee: " + employee.getName());
            System.out.println("1. Delete");
            System.out.println("2. Not sure");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                employeeRepository.removeEmployee(employee);
                System.out.println("Delete complete");
            }
        }
    }


    @Override
    public  void editEmployee() {
        System.out.println("Enter id of employee you want to delete");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getByIdEmployee(id);
        if (employee == null) {
            System.out.println("Id is incorrect");
        } else {
            System.out.println("Enter the select of the item to edit");
            System.out.println("1. Edit the id of employee");
            System.out.println("2. Edit the name of employee");
            System.out.println("3. Edit the date of birth of employee");
            System.out.println("4. Edit the gender of employee");
            System.out.println("5. Edit the identityCardNumber of employee");
            System.out.println("6. Edit the number phone of employee");
            System.out.println("7. Edit the email of employee");
            System.out.println("8. Edit the level of employee");
            System.out.println("9. Edit the position of employee");
            System.out.println("10. Edit the salary of employee");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {

                case 1:
                    String newId;
                    do {
                        System.out.println("Enter the id of new employee");
                        newId = scanner.nextLine();
                        if (!Regex.validIdEmployee(newId)) {
                            System.err.println("Enter Id with format: NV-YYYY (with Y is number)");
                        } else {
                            employee.setId(newId);
                            break;
                        }
                    } while (true);
                    break;

                case 2:
                    String name;
                    do {
                        System.out.println("Enter the name of new employee");
                        name = scanner.nextLine();
                        if (!Regex.validName(name)) {
                            System.err.println("Capitalize the first letter of each word");
                        } else {
                            employee.setName(name);
                            break;
                        }
                    } while (true);
                    break;

                case 3:
                    String date = "";
                    do {
                        try {
                            System.out.println("Enter the date of birth of new employee");
                            date = scanner.nextLine();
                            int year = Integer.parseInt("" + date.charAt(0) + date.charAt(1) + date.charAt(2) + date.charAt(3));
                            int month = Integer.parseInt("" + date.charAt(5) + date.charAt(6));
                            int day = Integer.parseInt("" + date.charAt(8) + date.charAt(9));
                            LocalDate bithday = LocalDate.of(year, month, day);
                            LocalDate today = LocalDate.now();
                            int age = Period.between(bithday, today).getYears();
                            if (Regex.vallidDateOfBirth(date) && age >= 18) {
                                employee.setDate(date);
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.err.println("Enter the date of birth with format YYYY-MM-DD");
                        } catch (Exception e) {
                            System.out.println("Enter the date of birth with format YYYY-MM-DD");
                        }
                    } while (true);
                    break;

                case 4:
                    int choiceGender;
                    boolean gender = true;
                    do {
                        System.out.println("Enter the gender of new employee");
                        System.out.println("1. Male");
                        System.out.println("2. Female");
                        choiceGender = Integer.parseInt(scanner.nextLine());
                        if (choiceGender == 1) {
                            gender = true;
                        } else if (choiceGender == 2) {
                            gender = false;
                        } else {
                            System.err.println("Enter 1 or 2");
                        }
                    } while (choiceGender != 1 && choiceGender != 2);
                    break;

                case 5:
                    String identityCardNumber = "";
                    do {
                        System.out.println("Enter the identity card number of new employee");
                        identityCardNumber = scanner.nextLine();
                        if (Regex.validIdentityCardNumber(identityCardNumber)) {
                            break;
                        } else {
                            System.err.println("Enter your 9 or 12 digit ID card number");
                        }
                    } while (true);
                    break;

                case 6:
                    String numberPhone = "";
                    do {
                        System.out.println("Enter the number phone of new employee");
                        numberPhone = scanner.nextLine();
                        if (Regex.validNumberPhone(numberPhone)) {
                            break;
                        } else {
                            System.out.println("number phone must start with 0 and have 10 number");
                        }
                    } while (true);
                    break;

                case 7:
                    System.out.println("Enter the new email of employee");
                    String email = scanner.nextLine();
                    employee.setEmail(email);
                    break;

                case 8:
                    String level;
                    do {
                        System.out.println("Enter the level of new employee");
                        level = scanner.nextLine();
                        if (Regex.checkLevel(level)) {
                            break;
                        } else {
                            System.out.println("Enter the level of new new employee with format: Trung cấp, Cao đẳng, Đại học, Sau đại học");
                        }
                    } while (true);
                    break;

                case 9:
                    String position = "";
                    do {
                        System.out.println("Enter the position of new employee");
                        position = scanner.nextLine();
                        if (Regex.checkPosition(position)) {
                            break;
                        } else {
                            System.out.println("Enter the position of new employee with format: Lễ tân, Phục vụ, Chuyên viên, Giám sát, Quản lý, Giám đốc");
                        }
                    } while (true);
                    break;

                case 10:
                    float salary = 0;
                    do {
                        try {
                            System.out.println("Enter the salary of new employee, salary must be greater than 0");
                            salary = Float.valueOf(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.err.println("Enter a Number");
                        }
                    } while (salary <= 0);
                    break;
                default:
                    System.out.println("Enter the number to choice");
            }
        }
        System.out.println("Edit complete");
        employeeRepository.editEmployee();
    }
}
