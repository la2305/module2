package ss11.excercise.CheckSymInMethodUseStack;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string, you want check sym");
        String string = scanner.nextLine();
        Stack<String> stackleft = new Stack<>();
        Stack<String> stackright = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '('){
                stackleft.push(string.charAt(i)+"");
            } else if (string.charAt(i)==')') {
                stackright.push(string.charAt(i)+"");
            }
        }
        if (stackleft.size()==0 || stackright.size()==0 || stackleft.size() !=stackright.size()){
            System.out.println("String is not correct math of syntax");
        } else {
            System.out.println("String is correct math of syntax");
        }
    }
}
