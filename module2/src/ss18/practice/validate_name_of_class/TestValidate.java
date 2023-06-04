package ss18.practice.validate_name_of_class;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestValidate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String regexDate = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regexDate);
        Matcher matcher = pattern.matcher(date);
        System.out.println(matcher.matches());
    }
}
