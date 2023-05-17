package ss7.excercise.implementResiableInterfaceForGeometryClasses;

import java.lang.reflect.Array;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5,"blue",true);
        Square square = new Square("blue",true,10);
        Circle circle2 = new Circle(10,"red",false);
        Circle circle3 = new Circle(15,"yellow",true);

        Shape [] array = new Shape[4];
        array [0] = circle1;
        array [1] = square;
        array [2] = circle2;
        array [3] = circle3;
//        System.out.println(circle1.getArea());

        for (Shape n: array) {
            System.out.println("Area: "+n.getArea());
            if( n instanceof Colorable){
                ((Colorable) n).howToColor();
            }
        }
    }
}
