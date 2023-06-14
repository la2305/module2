package ss20_algorithm;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Unit14 {
    public static void main(String[] args) {
        String s="";
        String [] array =s.split("");
        Set<String> list = new HashSet<>();
        for (String n:array) {
            list.add(n);
        }
        System.out.println(list.size());
    }
}
