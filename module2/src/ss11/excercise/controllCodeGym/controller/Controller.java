package ss11.excercise.controllCodeGym.controller;

import ss11.excercise.controllCodeGym.service.IPersonService;
import ss11.excercise.controllCodeGym.service.PersonService;


import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static IPersonService personService = new PersonService();
   public static void menu(){
       do{
           System.out.println("-----------------");
           System.out.println("Chọn chức năng theo số để tiếp tục:");
           System.out.println("1. Thêm mới giảng viên hoặc học sinh");
           System.out.println("2. Học sinh");
           System.out.println("3. Xóa giảng viên");
           System.out.println("4. Xem danh sách giảng viên hoặc học sinh");
           System.out.println("5. Thoát");
           System.out.println("Chọn chức năng:");
           int choice = Integer.parseInt(scanner.nextLine());
           switch (choice){
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
           }
       }while (true);
   }
}
