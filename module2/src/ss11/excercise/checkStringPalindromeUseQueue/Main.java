package ss11.excercise.checkStringPalindromeUseQueue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string, what do you want to check Palindrome string? ");
        String string1 = scanner.nextLine();
        string1 = string1.toLowerCase();
        String string2 = string1;
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new LinkedList<>();

        for (int i = 0; i < string1.length(); i++) {
            stringStack.push(string1.charAt(i) + "");
//            System.out.println(stringStack.get(i));
        }

        for (int i = 0; i < string2.length(); i++) {
            stringQueue.offer(string2.charAt(i) + "");
//            System.out.println(stringQueue.poll());
        }

        boolean flag = true;
        for (int i = 0; i < string1.length(); i++) {
            if (stringStack.pop().equals(stringQueue.poll())) {
                flag = true;
            }else {
                flag = false;
                break;
            }
        }

        if (flag ) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }
}
