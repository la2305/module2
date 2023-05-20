package ss11.excercise.convertFromDecimalToBinary;

import java.time.Clock;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String string = "";

        while (number > 0) {
            if (number % 2 == 0) {
                stack.push("0");
            } else {
                stack.push("1");
            }
            number = number / 2;
        }
        int stackLenght = stack.size();
        for (int i = 0; i < stackLenght; i++) {
            string += stack.pop();
        }
        System.out.println(string);
    }
}
