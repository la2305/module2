package ss20_algorithm;

import java.util.Locale;

public class Unit4 {
    public static void main(String[] args) {
        String string = "CodegymDaNang";
        String[] arrayString = string.split("");
        String append = "";
        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(arrayString[i].toUpperCase())){
                append +=" ";
            }
            append +=arrayString[i];
        }
        System.out.println(append.toLowerCase().trim());
    }
}
