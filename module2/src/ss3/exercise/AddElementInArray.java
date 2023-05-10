package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int[] array = {4, 6, 7, 8, 0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number you want to add in the array");
        int x = scanner.nextInt();
        System.out.println("Enter index of array you wan to add a number");
        int index = scanner.nextInt();
        if (index <= -1 || index >= array.length) {
            System.out.println("Can not add number in the array");
        }
        for (int i = array.length; index < i; i--) {
            array[i - 1] = array[i - 2];
        }
        array[index] = x;
        System.out.println(Arrays.toString(array));
    }
}
