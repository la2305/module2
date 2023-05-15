package ss6.excercise.classPoint2DAnd3D;

public class Test {
    public static void main(String[] args) {
        Point2D point2D_1 = new Point2D();
        System.out.println(point2D_1.toString());
        Point2D point2D_2 = new Point2D(5,10);
        System.out.println(point2D_2.toString());


        Point3D point3D_1 = new Point3D();
        System.out.println(point3D_1);
        Point3D point3D_2 = new Point3D(5,10,15);
        System.out.println(point3D_2);
    }
}
