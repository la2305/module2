package ss11.excercise.CountOccurrencesOfEachWorldInAStringUsingMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì bạn muốn");
        String string = scanner.nextLine();
        string.toLowerCase();
        String[] strArray = string.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String n : strArray) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        System.out.println(map.toString());
//        for (Map.Entry<String, Integer> n : map.entrySet()) {
//            System.out.println(n.getKey() + " - " + n.getValue());
//        }
    }
}
