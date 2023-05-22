package ss11.excercise.CheckSymInMethodUseStack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string, you want check sym");
        String str = scanner.nextLine();
        String[] string = str.split("");
        Stack<String> stack = new Stack<>();
        boolean flag = true;

        for (int i = 0; i < string.length; i++) {
            if (string[i].equals("(")) {
                stack.push(string[i]);
            }
            if (string[i].equals(")")) {
                if (stack.isEmpty()) {
                    flag = false;
                    break;
                }
                if (stack.pop() == string[i]) {
                    flag = false;
                    break;
                }
            }
        }
        if (stack.isEmpty() && flag)
            System.out.println("Well");
        else
            System.out.println("Not Well");

//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == '(') {
//                stackleft.push(string.charAt(i) + "");
//            }
//            if (string.charAt(i) == ')') {
//                stackright.push(string.charAt(i) + "");
//                if (stackleft.isEmpty()) {
//                    flag = false;
//                    break;
//                } else {
//                    if (stackleft.size() != stackright.size()) {
//                        flag = false;
//                        break;
//                    }else {
//                        flag = true;
//                        break;
//                    }
//                }
//            }
//        }
//        if (flag) {
//            System.out.println("String is correct math of syntax");
//        } else {
//            System.out.println("String is not correct math of syntax");
//        }
    }
}
