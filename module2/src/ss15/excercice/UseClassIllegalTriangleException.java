package ss15.excercice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UseClassIllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            float firstSide;
            float secondSide;
            float thirdSide;

            do {
                try {
                    System.out.println("Nhập cạnh thứ nhất");
                    firstSide = Float.parseFloat(scanner.nextLine());
                    if (firstSide <= 0) {
                        throw new IllegalTriangleException("Vui lòng nhập độ dài cạnh > 0");
                    }
                    break;
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (Exception e) {
                    System.out.println("error");
                }
            } while (true);

            do {
                try {
                    System.out.println("Nhập cạnh thứ hai");
                    secondSide = Float.parseFloat(scanner.nextLine());
                    if (secondSide <= 0) {
                        throw new IllegalTriangleException("Vui lòng nhập độ dài cạnh >0");
                    }
                    break;
                }catch (IllegalTriangleException e){
                    System.out.println(e.getMessage());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (Exception e){
                    System.out.println("Error");
                }
            } while (true);

            do {
                try {
                    System.out.println("Nhập cạnh thứ ba");
                    thirdSide = Float.parseFloat(scanner.nextLine());
                    if (thirdSide <= 0) {
                        throw new IllegalTriangleException("Vui lòng nhập độ dài cạnh >0");
                    }
                    break;
                }catch (IllegalTriangleException e){
                    System.out.println(e.getMessage());
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                }catch (Exception e){
                    System.out.println("Error");
                }
            } while (true);

            try {
                checkSide(firstSide, secondSide, thirdSide);
                System.out.println("Độ dài các cạnh hợp lí");
                break;
            } catch (IllegalTriangleException illegalTriangleException) {
                System.out.println(illegalTriangleException.getMessage());
                System.out.println("Vui lòng nhập lại");
            }
        }
    }

    public static boolean checkSide(float sideFirstOfTriangle, float sideSecondOfTriangle, float sideThirdOfTriangle) throws IllegalTriangleException {
        if (sideFirstOfTriangle + sideSecondOfTriangle <= sideThirdOfTriangle || sideSecondOfTriangle >= sideFirstOfTriangle + sideThirdOfTriangle || sideThirdOfTriangle + sideSecondOfTriangle <= sideFirstOfTriangle ) {
            throw new IllegalTriangleException("Cạnh không hợp lệ");
        }
        return true;
    }
}
