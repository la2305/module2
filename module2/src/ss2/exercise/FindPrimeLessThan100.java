package ss2.exercise;

public class FindPrimeLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrimeNumber(i) == false) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int number) {
        boolean check = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = true;
                break;
            }
        }
        return check;
    }
}
