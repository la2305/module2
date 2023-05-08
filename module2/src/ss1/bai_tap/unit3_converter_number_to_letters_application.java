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
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fiveteen");
                case 16:
                    System.out.println("sixteen");
                case 17:
                    System.out.println("seventeen");
                case 18:
                    System.out.println("eightteen");
                case 19:
                    System.out.println("nineteen");
            }
        } else if (number >= 20 && number < 100) {
            String string1 = "";
            String string2 = "";
            switch (number / 10) {
                case 2:
                    string1 = "twenty";
                    break;
                case 3:
                    string1 = "thirty";
                    break;
                case 4:
                    string1 = "forty";
                    break;
                case 5:
                    string1 = "fifty";
                    break;
                case 6:
                    string1 = "sixty";
                    break;
                case 7:
                    string1 = "seventy";
                    break;
                case 8:
                    string1 = "eightty";
                    break;
                case 9:
                    string1 = "ninety";
                    break;
            }
            switch (number % 10) {
                case 1:
                    string2 = "one";
                    break;
                case 2:
                    string2 = "two";
                    break;
                case 3:
                    string2 = "three";
                    break;
                case 4:
                    string2 = "four";
                    break;
                case 5:
                    string2 = "five";
                    break;
                case 6:
                    string2 = "six";
                    break;
                case 7:
                    string2 = "seven";
                    break;
                case 8:
                    string2 = "eight";
                    break;
                case 9:
                    string2 = "nine";
                    break;
            }
            System.out.println(string1 + "-" + string2);
        } else if (number >= 100 && number < 1000) {
            String string3 = "";
            String string4 = "";
            String string5 = "";
            switch (number / 100) {
                case 1:
                    string3 = "one hundred";
                    break;
                case 2:
                    string3 = "two hundred";
                    break;
                case 3:
                    string3 = "three hundred";
                    break;
                case 4:
                    string3 = "four hundred";
                    break;
                case 5:
                    string3 = "five hundred";
                    break;
                case 6:
                    string3 = "six hundred";
                    break;
                case 7:
                    string3 = "seven hundred";
                    break;
                case 8:
                    string3 = "eight hundred";
                    break;
                case 9:
                    string3 = "nine hundred";
                    break;
            }
            switch ((number % 100) / 10) {
                case 1:
                    switch (number % 100) {
                        case 10:
                            string4 = "ten";
                            break;
                        case 11:
                            string4 = "eleven";
                            break;
                        case 12:
                            string4 = "twelve";
                            break;
                        case 13:
                            string4 = "thirteen";
                            break;
                        case 14:
                            string4 = "fourteen";
                            break;
                        case 15:
                            string4 = "fiveteen";
                            break;
                        case 16:
                            string4 = "sixteen";
                            break;
                        case 17:
                            string4 = "seventeen";
                            break;
                        case 18:
                            string4 = "eightteen";
                            break;
                        case 19:
                            string4 = "nineteen";
                            break;
                    }
                    break;
                case 2:
                    string4 = "twenty";
                    break;
                case 3:
                    string4 = "thirty";
                    break;
                case 4:
                    string4 = "forty";
                    break;
                case 5:
                    string4 = "fifty";
                    break;
                case 6:
                    string4 = "sixty";
                    break;
                case 7:
                    string4 = "seventy";
                    break;
                case 8:
                    string4 = "eightty";
                    break;
                case 9:
                    string4 = "ninety";
                    break;
            }
            switch ((number % 100) % 10) {
                case 1:
                    string5 = "one";
                    break;
                case 2:
                    string5 = "two";
                    break;
                case 3:
                    string5 = "three";
                    break;
                case 4:
                    string5 = "four";
                    break;
                case 5:
                    string5 = "five";
                    break;
                case 6:
                    string5 = "six";
                    break;
                case 7:
                    string5 = "seven";
                    break;
                case 8:
                    string5 = "eight";
                    break;
                case 9:
                    string5 = "nine";
                    break;
            }
            if ((number % 100) < 20 && (number % 100) >= 10) {
                System.out.println(string3 + "-" + string4);
            } else {
                System.out.println(string3 + "-" + string4 + " " + string5);
            }
        } else {
            System.out.println("impossible");
        }
    }
}
