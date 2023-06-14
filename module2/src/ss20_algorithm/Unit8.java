package ss20_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Unit8 {
    public static void main(String[] args) {
        int[] parent = {1,4,5,2,1};
        int[] child = {1,2,3};
        List<Integer> list = new ArrayList<>();
        int count;
        for (int i = 0; i < child.length; i++) {
            count = 0;
            for (int j = 0; j < parent.length; j++) {
                if (child[i] == parent[j]) {
                    count++;
                }
            }
            list.add(count);
        }
        list.sort((o1, o2) -> o1 - o2);
        System.out.println(list.get(0));
    }
}
