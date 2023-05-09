package ss1.bai_tap;

import java.util.Scanner;

public class Unit1ShowGreetings {
    public static void main(String[] args) {
        String showGreeting;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        showGreeting = scanner.nextLine();
        System.out.println("hello "+showGreeting);
    }
}
