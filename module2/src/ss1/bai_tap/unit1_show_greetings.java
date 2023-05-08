package ss1.bai_tap;

import java.util.Scanner;

public class unit1_show_greetings {
    public static void main(String[] args) {
        String loiChao;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        loiChao = scanner.nextLine();
        System.out.println("hello "+loiChao);
    }
}
