package ss20_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit6 {
    public static void main(String[] args) {
        String string ="abdceffecdba";
        String[] array1 = string.split("");
        List<String> array2 = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            int count = 0;
            for (int j = i; j < array1.length; j++) {
                if (array1[i].equals(array1[j])){
                    count++;
                }
            }
            if (count>1){
                array2.add(array1[i]);
            }
        }
        System.out.println(array2);
    }
}
