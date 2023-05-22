package ss12.Product.controller;

import ss11.excercise.controllCodeGym.respository.IPersonRespository;
import ss11.excercise.controllCodeGym.respository.PersonRespository;
import ss11.excercise.controllCodeGym.service.IPersonService;
import ss11.excercise.controllCodeGym.service.PersonService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService personService = new PersonService();

    public static void menu() {
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÍ SẢN PHẨM");
            System.out.println("---------------------------------------------------");
            System.out.println("Chọn chức năng theo số để tiếp tục");
            System.out.println("1.Thêm mới sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xóa sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("7.Thoát");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    personService.displayAll();
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Thoát nhé");
                    System.exit(1);
            }

        } while (true);
    }
}
