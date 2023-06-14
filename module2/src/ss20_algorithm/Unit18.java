package ss20_algorithm;

import java.util.ArrayList;
import java.util.List;

public class Unit18 {
    public static void main(String[] args) {
        int [] array ={2, 3, 8};
        List<Integer> list = new ArrayList<>();
        for (int n:array) {
            list.add(n);
        }
        list.sort((o1, o2) -> o1-o2);
        List<Integer> list1 = new ArrayList<>();
        for (int i = list.get(0); i < list.get(list.size()-1); i++) {
            if (!list.contains(i)){
                list1.add(i);
            }
        }
        System.out.println(list1);
    }
}
