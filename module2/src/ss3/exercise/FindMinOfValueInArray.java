package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinOfValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Element: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min of array:" + min);
    }
}
