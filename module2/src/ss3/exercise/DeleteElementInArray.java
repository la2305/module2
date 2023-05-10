package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter the element you want to delete");
        int deleteNumber = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteNumber) {
                array[count] = array[i];
                count++;
            }
        }
        array[array.length - 1] = 0;
        System.out.println(Arrays.toString(array));
    }
}
