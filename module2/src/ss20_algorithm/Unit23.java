package ss20_algorithm;

public class Unit23 {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 10};
        boolean flag = true;
        int temp = array[1] - array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == temp) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}
