package ss1.mvc.controller;

import ss1.mvc.service.CodeGymService;

import java.util.Scanner;

public class CodeGymController {
    private CodeGymService codeGymService = new CodeGymService();

    public void showMenu() {
        MENU_WHILE:
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("----Hệ thống quản lý CodeGym----\n" +
                    "1. Hiển thị danh sách sinh viên \n" +
                    "2. Thêm sinh viên \n" +
                    "3. Xóa sinh viên \n" +
                    "4. Thoát \n" +
                    "Mời chọn chức năng");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    codeGymService.displayStudentList();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break MENU_WHILE;
                default:
                    System.out.println("Nhập sai chức năng vui lòng nhập lại");
            }
        } while (true);
    }
}
