package ss6.excercise.classCircleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        System.out.println(circle.toString());
        System.out.println("Circle area: "+circle.getArea());

        Cylinder cylinder = new Cylinder(10,"blue",20);
        System.out.println(cylinder.toString());
        System.out.println("Cylinder volume: "+ cylinder.getVolume());
    }
}
