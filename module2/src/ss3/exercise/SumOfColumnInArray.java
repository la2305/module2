package ss3.exercise;

import java.util.Scanner;

public class SumOfColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, column;
        System.out.println("Enter number of row in array");
        row = scanner.nextInt();
        System.out.println("Enter number of column in array");
        column = scanner.nextInt();
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter value of element: " + i + ":" + j);
                array[i][j] = scanner.nextInt();
            }
        }
        int numberOfColumn;
        do {
            System.out.println("Enter number of column, you want to sum");
            numberOfColumn = scanner.nextInt();
        } while (numberOfColumn > 0 && numberOfColumn > column);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                    sum += array[i][column-1];
        }
        System.out.println("Sum of column you entered: " + sum);
    }
}
