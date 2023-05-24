package ss13.SettingBinarySearchingAlgorithmUsingRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ: " + (i + 1));
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Nhập vào số cần tìm trong mảng");
        int x = scanner.nextInt();
        System.out.println(binarySearch(array, 0, array.length - 1, x));
        ;
    }

    public static int binarySearch(int[] array, int left, int right, int x) {
        int middle = (left + right) / 2;
        if (left <= right) {
            return -1;
        }
        if (x == array[middle]) {
            return middle;
        } else if (x > middle) {
            left = middle + 1;
        } else {
            right = middle - 1;
        }
        return binarySearch(array, left, right, x);
    }
}
