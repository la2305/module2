package ss19_case_study.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean validIdEmployee(String id) {
        String regexClassId = "^[N][V][-]\\d{4}$";
        Pattern pattern = Pattern.compile(regexClassId);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
    public static boolean validIdCustomer(String id) {
        String regexClassId = "^[K][H][-]\\d{4}$";
        Pattern pattern = Pattern.compile(regexClassId);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public static boolean validName(String name) {
        String regexClassName = "^((\\b[A-Z][a-z]{1,15})\\s*){2,15}$";
        Pattern pattern = Pattern.compile(regexClassName);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static boolean validIdentityCardNumber(String identity) {
        if (identity.length() == 9 || identity.length() == 12) {
            return true;
        }
        return false;
    }

    public static boolean validNumberPhone(String numberPhone) {
        String regexNumberPhone = "^[0]\\d{9}$";
        Pattern pattern = Pattern.compile(regexNumberPhone);
        Matcher matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }

    public static boolean vallidDateOfBirth(String date) {
        String regexDate = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern pattern = Pattern.compile(regexDate);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }
    public static boolean checkLevel(String level){
        String regexLevel ="^(Trung cấp)|(Cao đẳng)|(Đại học)|(Sau đại học)$";
        Pattern pattern = Pattern.compile(regexLevel);
        Matcher matcher =pattern.matcher(level);
        return matcher.matches();
    }
    public static boolean checkPosition(String position){
        String regexPosition ="^(Lễ tân)|(Phục vụ)|(Chuyên viên)|(Giám sát)|(Quản lý)|(Giám đốc)$";
        Pattern pattern =Pattern.compile(regexPosition);
        Matcher matcher =pattern.matcher(position);
        return matcher.matches();
    }

    public static boolean checkTypeOfCustomer(String type){
        String regexTypeCustomer ="^(Diamond)|(Platinum)|(Gold)|(Silver)|(Member)$";
        Pattern pattern=Pattern.compile(regexTypeCustomer);
        Matcher matcher =pattern.matcher(type);
        return matcher.matches();
    }

    public static boolean checkServiceFacilityHouse(String facility){
        String regexFacilityHouse ="^[S][V][H][O][-]\\d{4}$";
        Pattern pattern =Pattern.compile(regexFacilityHouse);
        Matcher matcher = pattern.matcher(facility);
        return matcher.matches();
    }
    public static boolean checkServiceFacilityVilla(String facility){
        String regexFacilityHouse ="^[S][V][V][L][-]\\d{4}$";
        Pattern pattern =Pattern.compile(regexFacilityHouse);
        Matcher matcher = pattern.matcher(facility);
        return matcher.matches();
    }
    public static boolean checkServiceFacilityRoom(String facility){
        String regexFacilityHouse ="^[S][V][R][O][-]\\d{4}$";
        Pattern pattern =Pattern.compile(regexFacilityHouse);
        Matcher matcher = pattern.matcher(facility);
        return matcher.matches();
    }
    public static boolean checkServiceFreeInclude(String serviceFree){
        String regexTypeCustomer ="^(Khăn giấy)|(Bao cao su)|(Nước suối)|(Khăn tắm)|(Xà phòng)$";
        Pattern pattern=Pattern.compile(regexTypeCustomer);
        Matcher matcher =pattern.matcher(serviceFree);
        return matcher.matches();
    }
    public static boolean checkServiceCodeFacility(String id){
        String regex ="^([S][V][R][O][-]\\d{4})||([S][V][V][L][-]\\d{4})||[S][V][H][O][-]\\d{4}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }
}
