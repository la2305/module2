package ss19_case_study.controller;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);

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
        DO_WHILE: do {
            System.out.println("------Menu Employee Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayCustomerManagementMenu() {
        DO_WHILE: do {
            System.out.println("------Menu Customer Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayFacilityManagementMenu() {
        DO_WHILE: do {
            System.out.println("------Menu Facility Management------");
            System.out.println("--Enter a number from your keyboard to choose service--");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Back main menu");
                    break DO_WHILE;
                default:
                    System.out.println("Enter a number to choose service");
            }
        } while (true);
    }

    public static void displayBookingManagement() {
        DO_WHILE: do {
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

                    break;
                case 2:

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
        DO_WHILE: do {
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
