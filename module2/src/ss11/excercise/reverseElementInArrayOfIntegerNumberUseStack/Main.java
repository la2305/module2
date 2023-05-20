package ss11.excercise.reverseElementInArrayOfIntegerNumberUseStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        Number[] arrayNumber = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayNumber.length; i++) {
            stack.push(arrayNumber[i]);
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = stack.pop();
        }
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i]);
        }

        System.out.println("--------");
        Stack<String> wStack = new Stack<>();
        String mWord = "Lê     Quang Phước    Đẹp Trai";
        String newString = "";
        String[] words = mWord.split("\\s");
        for (String n : words) {
            wStack.push(n);
        }
        for (int i = 0; i < words.length; i++) {
            words[i] = wStack.pop();
        }
        System.out.println(mWord);
        for (int i = 0; i < words.length; i++) {
            newString += words[i];
        }
        System.out.print(newString);
    }
}
