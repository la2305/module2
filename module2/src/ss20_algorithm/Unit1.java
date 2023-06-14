package ss20_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unit1 {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1, 4, 2, 3, 1, };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }
        boolean flag = true;
        int temp = map.get(array[0]);
        for (Integer nnn : map.values()) {
            if (temp != nnn) {
                flag = false;
                break;
            }else
                flag =true;
        }
        if (map.size()==1){
            flag =false;
        }
        System.out.println(flag);
    }
}
