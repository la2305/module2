package ss15.excercice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseClassIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            float firstSide ;
            float secondSide ;
            float thirdSide ;

            do {
                try {
                    System.out.println("Nhập cạnh thứ nhất");
                    firstSide = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            do {
                try {
                    System.out.println("Nhập cạnh thứ hai");
                    secondSide = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            do {
                try {
                    System.out.println("Nhập cạnh thứ ba");
                    thirdSide =  Float.parseFloat(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }
            } while (true);

            try{
                checkSide(firstSide,secondSide,thirdSide);
                System.out.println("Độ dài các cạnh hợp lí");
                break;
            } catch (IllegalTriangleException illegalTriangleException){
                System.out.println(illegalTriangleException.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static boolean checkSide(float sideFirstOfTriangle, float sideSecondOfTriangle, float sideThirdOfTriangle) throws IllegalTriangleException {
        if (sideFirstOfTriangle < 0 || sideSecondOfTriangle < 0 || sideThirdOfTriangle < 0 || sideFirstOfTriangle > sideSecondOfTriangle + sideThirdOfTriangle || sideSecondOfTriangle > sideFirstOfTriangle + sideThirdOfTriangle || sideThirdOfTriangle > sideFirstOfTriangle + sideSecondOfTriangle) {
            throw new IllegalTriangleException("Cạnh không hợp lệ");
        }
        return true;
    }
}
