package ss20_algorithm;

import java.util.ArrayList;
import java.util.List;

public class Unit16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0};
        List<Integer> listSum = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            listSum.add(sum);
        }
        System.out.println(listSum);
    }
}
