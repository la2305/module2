package ss17.excercise.MVC.controller;

import ss17.excercise.MVC.service.IProductService;
import ss17.excercise.MVC.service.ProductService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);

    private static IProductService iProductService = new ProductService();

    public static boolean menu() {
        do {
            System.out.println("Lựa chọn một trong những chức năng dưới đây");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Thoát khỏi chương trình");
            int choice = 0;
            try {
                System.out.println("Nhập lựa chọn của bạn từ bàn phím");
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập 1 số");
            }catch (Exception e){
                System.out.println("Error");
            }

            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.displayAll();
                    break;
                case 3:
                    iProductService.findName();
                    break;
                case 4:
                    iProductService.deleteProduct();
                    break;
                case 5:
                    System.out.println("Thoát nhé");
                    System.exit(1);
                default:
                    System.out.println("Nhập số >0 && <6");
            }
        } while (true);
    }
}
