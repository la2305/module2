package ss19_case_study.service;

import ss19_case_study.common.Regex;
import ss19_case_study.model.customer.Customer;
import ss19_case_study.respository.CustomerRepository;
import ss19_case_study.respository.implement.ICustomerRepository;
import ss19_case_study.service.implement.ICustomerService;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static ICustomerRepository customerRepository = new CustomerRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayAll() {
        List<Customer> customers = customerRepository.getAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {


        // id of customer
        String id;
        do {
            System.out.println("Enter the id of new customer");
            id = scanner.nextLine();
            if (!Regex.validIdCustomer(id)) {
                System.err.println("Enter Id with format: KH-YYYY (with Y is number)");
            } else {
                break;
            }
        } while (true);


        //name of customer
        String name;
        do {
            System.out.println("Enter the name of new customer");
            name = scanner.nextLine();
            if (!Regex.validName(name)) {
                System.err.println("Capitalize the first letter of each word");
            } else {
                break;
            }
        } while (true);


        //date of customer
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


        //gender of customer
        int choice;
        boolean gender = true;
        do {
            System.out.println("Enter the gender of new customer");
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
            System.out.println("Enter the identity card number of new customer");
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
            System.out.println("Enter the number phone of new customer");
            numberPhone = scanner.nextLine();
            if (Regex.validNumberPhone(numberPhone)) {
                break;
            } else {
                System.out.println("number phone must start with 0 and have 10 number");
            }
        } while (true);


        System.out.println("Enter the email of new customer");
        String email = scanner.nextLine();


        System.out.println("Enter the type of new customer");
        String type;
        do {
            type = scanner.nextLine();
            if (Regex.checkTypeOfCustomer(type)) {
                break;
            } else {
                System.out.println("Enter the type of customer with format: Diamond, Platinum, Gold, Silver, Member");
            }
        } while (true);


        System.out.println("Enter the location of new customer");
        String location = scanner.nextLine();


        Customer customer = new Customer(id, name, date, gender, identityCardNumber, numberPhone, email, type, location);
        customerRepository.addCustomer(customer);
        System.out.println("Add customer complete");
    }

    @Override
    public void deleteCustomer() {
        System.out.println("Enter id of customer you want to delete");
        String id = scanner.nextLine();
        Customer customer = customerRepository.getByIdCustomer(id);
        if (customer == null) {
            System.out.println("Find not customer with id: " + id);
        } else {
            System.out.println("Are you sure delete customer: " + customer.getName());
            System.out.println("1. Delete");
            System.out.println("2. Not sure");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                customerRepository.removeCustomer(customer);
                System.out.println("Delete complete");
            }
        }
    }

//    public Customer(String id, String name, String date, boolean gender, String identityCardNumber, String numberPhone, String email, String customerType, String location) {

    @Override
    public void editCustomer() {
        System.out.println("Enter id of customer you want to edit");
        String id = scanner.nextLine();
        Customer customer = customerRepository.getByIdCustomer(id);
        if (customer == null) {
            System.out.println("Id is incorrect");
        } else {
            System.out.println("Enter the select of the item to edit");
            System.out.println("1. Edit the id of customer");
            System.out.println("2. Edit the name of customer");
            System.out.println("3. Edit the date of birth of customer");
            System.out.println("4. Edit the gender of customer");
            System.out.println("5. Edit the identityCardNumber of customer");
            System.out.println("6. Edit the number phone of customer");
            System.out.println("7. Edit the email of customer");
            System.out.println("8. Edit the type of customer");
            System.out.println("9. Edit the location of employee");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String idNew;
                    do {
                        System.out.println("Enter the id of new customer");
                        idNew = scanner.nextLine();
                        if (!Regex.validIdCustomer(idNew)) {
                            System.err.println("Enter Id with format: KH-YYYY (with Y is number)");
                        } else {
                            customer.setId(idNew);
                            break;
                        }
                    } while (true);
                    break;

                case 2:
                    String name;
                    do {
                        System.out.println("Enter the name of new customer");
                        name = scanner.nextLine();
                        if (!Regex.validName(name)) {
                            System.err.println("Capitalize the first letter of each word");
                        } else {
                            customer.setName(name);
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
                                customer.setDate(date);
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
                    int choiceNew;
                    boolean gender = true;
                    do {
                        System.out.println("Enter the gender of new customer");
                        System.out.println("1. Male");
                        System.out.println("2. Female");
                        choiceNew = Integer.parseInt(scanner.nextLine());
                        if (choiceNew == 1) {
                            gender = true;
                        } else if (choiceNew == 2) {
                            gender = false;
                        } else {
                            System.err.println("Enter 1 or 2");
                        }
                    } while (choiceNew != 1 && choiceNew != 2);
                    customer.setGender(gender);
                    break;

                case 5:
                    String identityCardNumber = "";
                    do {
                        System.out.println("Enter the identity card number of new customer");
                        identityCardNumber = scanner.nextLine();
                        if (Regex.validIdentityCardNumber(identityCardNumber)) {
                            break;
                        } else {
                            System.err.println("Enter your 9 or 12 digit ID card number");
                        }
                    } while (true);
                    customer.setIdentityCardNumber(identityCardNumber);
                    break;

                case 6:
                    String numberPhone = "";
                    do {
                        System.out.println("Enter the number phone of new customer");
                        numberPhone = scanner.nextLine();
                        if (Regex.validNumberPhone(numberPhone)) {
                            break;
                        } else {
                            System.out.println("number phone must start with 0 and have 10 number");
                        }
                    } while (true);
                    customer.setNumberPhone(numberPhone);
                    break;

                case 7:
                    System.out.println("Enter the email of new customer");
                    String email = scanner.nextLine();
                    customer.setEmail(email);
                    break;

                case 8:
                    System.out.println("Enter the type of new customer");
                    String type;
                    do {
                        type = scanner.nextLine();
                        if (Regex.checkTypeOfCustomer(type)) {
                            break;
                        } else {
                            System.out.println("Enter the type of customer with format: Diamond, Platinum, Gold, Silver, Member");
                        }
                    } while (true);
                    customer.setCustomerType(type);
                    break;

                case 9:
                    System.out.println("Enter the location of new customer");
                    String location = scanner.nextLine();
                    customer.setLocation(location);
                    break;
                default:
                    System.out.println("Enter the number to choice");
            }
        }
        System.out.println("Edit complete");
        customerRepository.editEmployee();
    }

    @Override
    public void findNameCustomer() {
        System.out.println("Enter name of customer you want to search");
        String name = scanner.nextLine();
        customerRepository.getByName(name);
    }
}