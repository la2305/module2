package ss1.thuc_hanh;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        float witdh;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter witdh");
        witdh = scanner.nextFloat();

        System.out.println("Enter height");
        height = scanner.nextFloat();

        float area = witdh*height;
        System.out.println("Area is: "+ area);
    }
}
