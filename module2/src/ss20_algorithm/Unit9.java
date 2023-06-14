package ss20_algorithm;

public class Unit9 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int count = 0;
        for (int i = x; i <= y; i++) {
            if (check(i)){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check(int x) {
        String str = String.valueOf(x);
        if (str.length() == 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return true;
        }
        return false;
    }
}
