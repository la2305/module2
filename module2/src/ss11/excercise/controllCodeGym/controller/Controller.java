package ss11.excercise.controllCodeGym.controller;

import ss11.excercise.controllCodeGym.service.IPersonService;
import ss11.excercise.controllCodeGym.service.PersonService;


import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService personService = new PersonService();

    public static void menu() {
        do {
            System.out.println("-----------------");
            System.out.println("Chọn chức năng theo số để tiếp tục:");
            System.out.println("1. Thêm mới giảng viên hoặc học sinh");
            System.out.println("2. Xóa giảng viên hoặc học sinh");
            System.out.println("3. Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4. Thoát");
            int choice = 0;
            try {
                System.out.println("Chọn chức năng:");
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập vào 1 số ");
            }
            switch (choice) {
                case 1:
                    personService.addPerson();
                    break;
                case 2:
                    personService.deletePerson();
                    break;
                case 3:
                    personService.displayAll();
                    break;
                case 4:
                    System.out.println("Thoát nhé");
                    System.exit(1);
                default:
                    System.out.println("Vui lòng nhập số >0 và <5");
            }
        } while (true);
    }
}
