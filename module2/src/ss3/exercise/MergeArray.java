package ss3.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of element in array 1");
        int numberOfArray1 = scanner.nextInt();
        int[] array1 = new int[numberOfArray1];
        for (int i = 0; i < numberOfArray1; i++) {
            System.out.println("Enter number: " + (i + 1));
            array1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array1));

        System.out.println("Enter number of element in array 2");
        int numberOfArray2 = scanner.nextInt();
        int[] array2 = new int[numberOfArray2];
        for (int i = 0; i < numberOfArray2; i++) {
            System.out.println("Enter number: " + (i + 1));
            array2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[numberOfArray1 + numberOfArray2];
        for (int i = 0; i < (array3.length - array2.length); i++) {
            array3[i] = array1[i];
        }
        int count = 0;
        for (int i = array3.length - array1.length - 1; i < array3.length; i++) {
            array3[i] = array2[count];
            count++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
