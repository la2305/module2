package ss20_algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Unit19b {
    public static void main(String[] args) {
        int [] array = {3, 2, 2, 3,-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        System.out.println(map);
        Set<Integer> set = new HashSet<>();
        for (Integer n:map.values()) {
            set.add(n);
        }
        if (set.size()!=1){
            System.out.println(false);
        }else {
            System.out.println(true);
        }
    }
}
