package ss1.bai_tap;

import java.util.Scanner;

public class unit2_currency_converter_application {
    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD bạn muốn quy đôỉ");
        usd = scanner.nextDouble();
        double vdn = usd*rate;
        System.out.println("Số tiền của bạn nhập vào quy đổi ra tiền Việt Nam là: "+vdn+"Đ");
    }
}
