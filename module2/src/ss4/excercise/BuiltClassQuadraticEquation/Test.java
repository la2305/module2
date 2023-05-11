package ss4.excercise.BuiltClassQuadraticEquation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        BuiltClassQuadraticEquation abc = new BuiltClassQuadraticEquation(a, b, c);

        if (abc.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (abc.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép x1=x2= " + abc.getDoubleSolution());
        } else {
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + abc.getRoot1() + "; x2 = " + abc.getRoot2());
        }
    }
}
