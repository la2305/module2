package ss18.practice.validate_name_of_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Class {
    public static void main(String[] args) {
        String classValid = "C0323G";
        String classInValid ="c0323G";
        String regexClass = "^[CAP]\\d{4}[GHIK]$";

        Pattern pattern = Pattern.compile(regexClass);

        Matcher matcher1 = pattern.matcher(classValid);
        boolean checkValid = matcher1.matches();
        System.out.println(checkValid);

        Matcher matcher2 = pattern.matcher(classInValid);
        boolean checkInValid = matcher2.matches();
        System.out.println(checkInValid);
    }
}
