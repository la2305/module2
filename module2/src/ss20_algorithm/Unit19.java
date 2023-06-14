package ss20_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unit19 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 0, 1, 3, 0, 3};
        Set<Integer> list = new TreeSet<>();
        for (int n : array) {
            list.add(n);
        }
        int count;
        Set<Integer> integerList = new TreeSet<>();
        for (int n : list) {
            count = 0;
            for (int i = 0; i < array.length; i++) {
                if (n == array[i]) {
                    count++;
                }
            }
            integerList.add(count);
        }

        if (integerList.size()==1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
