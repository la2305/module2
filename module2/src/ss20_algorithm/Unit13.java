package ss20_algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unit13 {
    public static void main(String[] args) {
        int[] array = {10, 3, 8, 1, 9, 4, 9};
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        if (list.size()==1){
            System.out.println("-1");
            System.exit(1);
        }
        int[] array2 = {10, 3, 8, 1, 9, 4, 9};
        int temp;
        for (int i = 0; i <array2.length-1 ; i++) {
            for (int j = 0; j <array2.length-1 ; j++) {
                if (array2[j]>array2[j+1]){
                    temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] =temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==array2[array2.length-2]){
                System.out.println(i);
                break;
            }
        }
    }
}
