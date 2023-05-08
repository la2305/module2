package ss1.bai_tap;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class unit3_converter_number_to_letters_application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số bạn muốn chuyển qua chữ");
        int number = scanner.nextInt();

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (10 <= number && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("four teen");
                    break;
                case 15:
                    System.out.println("five teen");
                case 16:
                    System.out.println("six teen");
                case 17:
                    System.out.println("seven teen");
                case 18:
                    System.out.println("eight teen");
                case 19:
                    System.out.println("nine teen");
            }
        } else if(number>=20 && number<100){
            String a;
                switch (number%10){
                    case 2:
                         a = "two";
                        break;
                    case 3:
                         a = " three";
                        break;
                    case 4:
                        System.out.println("fourty");
                        break;
                    case 5:
                        System.out.println("fivety");
                        break;
                    case 6:
                        System.out.println("sixty");
                        break;
                    case 7:
                        System.out.println("seventy");
                    case 8:
                        System.out.println("eightty");
                    case 9:
                        System.out.println("ninety");
            }
        }
    }
}
