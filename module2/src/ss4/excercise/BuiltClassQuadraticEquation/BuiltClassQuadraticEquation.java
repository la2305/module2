package ss4.excercise.BuiltClassQuadraticEquation;

public class BuiltClassQuadraticEquation {
    private double a;
    private double b;
    private double c;

    public BuiltClassQuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getDoubleSolution() {
        return -b / (2 * a);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }


    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRoot3() {
        return -c / b;
    }
}
