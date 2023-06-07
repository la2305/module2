package ss19_case_study.controller;

import ss19_case_study.service.BookingService;
import ss19_case_study.service.CustomerService;
import ss19_case_study.service.EmployeeService;
import ss19_case_study.service.FacilityService;
import ss19_case_study.service.implement.IBookingService;
import ss19_case_study.service.implement.ICustomerService;
import ss19_case_study.service.implement.IEmployeeService;
import ss19_case_study.service.implement.IFacilityService;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static IEmployeeService employeeService = new EmployeeService();
    private static ICustomerService customerService = new CustomerService();
    private static IFacilityService facilityService = new FacilityService();
    private static IBookingService bookingService = new BookingService();

    public static boolean displayMainMenu() {
        do {
            System.out.println("------Menu Main------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Employee management");
            System.out.println("2. Customer managenment");
            System.out.println("3. Facility management");
            System.out.println("4. Booking management");
            System.out.println("5. Promotion management");
            System.out.println("6. Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayEmployeeManagementMenu();
                    break;
                case 2:
                    displayCustomerManagementMenu();
                    break;
                case 3:
                    displayFacilityManagementMenu();
                    break;
                case 4:
                    displayBookingManagement();
                    break;
                case 5:
                    displayPromotionManagement();
                    break;
                case 6:
                    System.out.println("Bye bye thank you and see you again");
                    System.exit(1);
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayEmployeeManagementMenu() {
        DO_WHILE:
        do {
            System.out.println("------Menu Employee Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit infomation of employee");
            System.out.println("4. Delete employee");
            System.out.println("5. Find employee follow name");
            System.out.println("6. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeService.displayAll();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    employeeService.deleteEmployee();
                    break;
                case 5:
                    employeeService.findNameEmployee();
                    break;
                case 6:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayCustomerManagementMenu() {
        do {
            System.out.println("------Menu Customer Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Delete customer");
            System.out.println("5. Find customer follow name");
            System.out.println("6. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerService.displayAll();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    customerService.deleteCustomer();
                    break;
                case 5:
                    customerService.findNameCustomer();
                    break;
                case 6:
                    System.out.println("Back main menu");
                    return;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayFacilityManagementMenu() {
        DO_WHILE:
        do {
            System.out.println("------Menu Facility Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Delete facility");
            System.out.println("5. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityService.displayAll();
                    break;
                case 2:
                    facilityService.addFacility();
                    break;
                case 3:
                    facilityService.findFacilityNeedMaintenance();
                    break;
                case 4:
                    facilityService.deleteFacility();
                    break;
                case 5:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayBookingManagement() {
        DO_WHILE:
        do {
            System.out.println("------Menu Booking Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new contracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    bookingService.add();
                    break;
                case 2:
                    bookingService.display();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayPromotionManagement() {
        DO_WHILE:
        do {
            System.out.println("------Menu Promotion Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }
}
