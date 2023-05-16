package ss7.excercise.implementColorableInterfaceForGeomatryClasses;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"blue",true);
        System.out.println(circle);
        System.out.println("Area of circle before resize: "+circle.getArea());
        circle.resize(10);
        System.out.println("Area of circle after resize: "+circle.getArea());
        System.out.println("\t");
        System.out.println("\t");
        Rectangle rectangle = new Rectangle("blue",false,10,20);
        System.out.println(rectangle);
        System.out.println("Area of rectangle before resize: "+rectangle.getArea());
        rectangle.resize(50);
        System.out.println("Area of rectangle after resize: "+rectangle.getArea());
        System.out.println("\t");
        System.out.println("\t");
        Square square = new Square("yellow",true,10);
        System.out.println(square);
        System.out.println("Area of square before resize: "+square.getArea());
        square.resize(100);
        System.out.println("Area of square after resize: "+square.getArea());
    }
}
