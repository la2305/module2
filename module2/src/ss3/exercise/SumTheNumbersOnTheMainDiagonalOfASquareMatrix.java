package ss3.exercise;

import java.util.Scanner;

public class SumTheNumbersOnTheMainDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of row");
        int row = scanner.nextInt();
        System.out.println("Enter number of column");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter value of element: " + i + ":" + j);
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of number on diagonal of matrix: " + sum);
    }
}
