package ss14;

import java.util.Arrays;

public class SettingInsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{8, 2, 5, 4, 15, 8, 10};
        System.out.println("* Mảng trước khi sắp xếp" + Arrays.toString(array));
        InsertSort(array);
        System.out.println("* Mảng sau khi sắp xếp" + Arrays.toString(array));
    }

    public static void InsertSort(int[] array) {
        int x;
        int position;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            position = i;
            while (position > 0 && x < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = x;
        }
    }
}
