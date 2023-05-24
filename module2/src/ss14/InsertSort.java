package ss14;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{8, 2, 5, 4, 15, 8, 10};
        //In ra màng hình mảng trước khi sắp xếp
        System.out.println("* Mảng trước khi sắp xếp" + Arrays.toString(array));
        //Gọi hàm InsertSort để truyền mảng ở trên vào.
        InsertSort(array);
        //In ra màng hình mảng sau khi sắp xếp
        System.out.println("* Mảng sau khi sắp xếp" + Arrays.toString(array));
    }
    public static void InsertSort(int[] array) {
        int x;
        int positon;
        //Sử dụng 1 vòng lặp for để duyệt từ vị thí thứ i cho đến cuối mảng.
        for (int i = 1; i < array.length; i++) {
            //- Gán cho x có giá trị là phần tử tại vị trí thứ i trong mảng
            x = array[i];
            //- Gán cho position là vị trí index của phần tử thứ i
            positon = i;
            //Khi  Position > 0 và x < phần tử trong mảng tại ví trí thứ positon-1 thì thực hiện việc bên dưới
            while (positon>0 && x <array[positon-1]){
                //Gán phần tử tại vị trí có index là positon thành phần tử tại vị trí có index là positon-1
                array[positon] = array[positon-1];
                //Giảm Position xuống 1 đơn vị
                positon--;
            }
            //Gán phần tử tại vị trí có index là positon thành phần tử x");
            array[positon]=x;
            System.out.println("Mảng tại vòng lặp thứ "+i+ " là: "+Arrays.toString(array));
        }
    }
}
