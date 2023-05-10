package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheNumberOfTheOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        char[] array = str.toCharArray();
        System.out.println(Arrays.toString(array));
        System.out.println("Enter a character");
        String character = scanner.nextLine();
        char c = character.charAt(0);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (c == array[i]) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("character " + c + " is the present in array and it appears " + count + " times");
        } else {
            System.out.println("character is not present in the array");
        }
    }
}
