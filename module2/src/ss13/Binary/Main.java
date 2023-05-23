package ss13.Binary;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int []{1,2,3,4,5,6};
        System.out.println("Nhập vào số cần tìm");
        int x = scanner.nextInt();
        System.out.println(timKiemBangCachDuyetMang(arr,x));
        System.out.println(timKiemBangCachDuyetMang(arr,x));


    }
    public static int timKiemBangCachDuyetMang(int [] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (x ==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static int timKiemBangNhiPhan(int [] arr, int x ){
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length -1;
        while (first<last){
            int mid = (first+last)/2;
            if (x ==arr[mid]){
                return mid;
            } else if (x <arr[mid]) {
                last = mid -1;
            }else {
                first = mid +1;
            }
        }
        return -1;
    }
}
