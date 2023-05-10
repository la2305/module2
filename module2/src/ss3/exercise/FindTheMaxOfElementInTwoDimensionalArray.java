package ss3.exercise;

import java.util.Scanner;

public class FindTheMaxOfElementInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row");
        int row = scanner.nextInt();
        System.out.println("Enter number of column");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter the element: " + i + ":" + j);
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Max of array: " + max);
    }
}
