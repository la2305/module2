package ss20_algorithm;

import java.util.Arrays;

public class Unit5 {
    public static void main(String[] args) {
        int[] array = {-1, 150, -1, 170, -1, -1, 160, 180};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i] && array[i]!=-1 ) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}









