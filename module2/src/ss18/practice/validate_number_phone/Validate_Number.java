package ss18.practice.validate_number_phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Number {
    public static void main(String[] args) {
        String numberPhoneValid =" (84)-(0978489648)";
        String numberPhoneInValid ="(a8)-(22222222)";
        String numberPhoneRegex ="^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
        Pattern pattern = Pattern.compile(numberPhoneRegex);

        Matcher matcher1 = pattern.matcher(numberPhoneValid);
        boolean checkNumberPhoneValid =matcher1.matches();
        System.out.println(checkNumberPhoneValid);

        Matcher matcher2 = pattern.matcher(numberPhoneInValid);
        boolean checkNumberPhoneInvalid = matcher2.matches();
        System.out.println(checkNumberPhoneInvalid);
    }
}
