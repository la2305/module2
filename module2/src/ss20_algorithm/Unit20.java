package ss20_algorithm;

import java.util.*;

public class Unit20 {
    public static void main(String[] args) {
        String [] inputArray = { "abc","" ,"a"};
        Set<Integer> set = new HashSet<>();
        for (String n:inputArray) {
            set.add(n.length());
        }
        Set<String> set2 = new LinkedHashSet<>();
        for (Integer n:set) {
            for (int i = 0; i < inputArray.length; i++) {
                if (n==inputArray[i].length()){
                    set2.add(inputArray[i]);
                }
            }
        }
        System.out.println(set2);
    }
}
