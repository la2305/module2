package ss20_algorithm;

public class Unit3 {
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 2};
        System.out.println(checkArr(array));
    }

    public static boolean checkArr(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int sumFirst = 0;
            int sumSecond = 0;
            for (int j = 0; j < i; j++) {
                sumFirst += array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                sumSecond += array[j];
            }
            if (sumFirst==sumSecond){
                return true;
            }
        }
        return false;
    }
}
