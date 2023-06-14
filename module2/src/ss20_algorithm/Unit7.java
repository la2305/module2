package ss20_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unit7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 8, 43}, {9, 4, 11, 7}, {11, 6, 4, 0}, {1, 2, 6, 51}};
        List<Integer> push = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (checkPrimeNumber(array[i][j])){
                    if (!push.contains(array[i][j])){
                        push.add(array[i][j]);
                    }
                }
            }
        }
        push.sort((o1, o2) -> o1-o2);
        System.out.println(push);
    }

    public static boolean checkPrimeNumber(int x) {
        if (x <= 1) {
            return false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
