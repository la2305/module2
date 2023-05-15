package ss5.excercise.accessModifier;

import java.lang.reflect.Modifier;

public class Circle {
    private double radius = 5.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    // xài protected với default như nhau nhưng protected
    // có thể kế thừa xa hơn qua các packed gần như có extend từ lớp cha
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
