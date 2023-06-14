package ss20_algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unit2 {
    public static void main(String[] args) {
        String s1 = "Abc";
        String s2 = "ade";
        String[] array1 = s1.split("");
        String[] array2 = s2.split("");

        List<String> arrayList1 = new ArrayList<>();
        for (String n : array1) {
            arrayList1.add(n);
        }
        List<String> arrayList2 = new ArrayList<>();
        for (String n : array2) {
            arrayList2.add(n);
        }

        int count = 0;
        for (int i = 0; i < arrayList1.size(); i++) {
            for (int j = 0; j < arrayList2.size(); j++) {
                if (arrayList1.get(i).equals(arrayList2.get(j))) {
                    arrayList1.remove(i);
                    arrayList2.remove(j);
                    count++;
                    i--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
