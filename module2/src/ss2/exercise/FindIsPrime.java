package ss2.exercise;

import java.util.Scanner;

public class FindIsPrime {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 20; i++) {
            if (isPrimeNumber(i) == true) {
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        int i = 2;
        boolean check = true;
        while (i < number) {
            if (number % i == 0) {
                check = false;
                break;
            }
            i++;
        }
        return check;
    }
}
