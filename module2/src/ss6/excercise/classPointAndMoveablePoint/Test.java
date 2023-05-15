package ss6.excercise.classPointAndMoveablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        MovablePoint movablePoint1 = new MovablePoint(5,5,10,10);
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());
        System.out.println(movablePoint1.move1());
        System.out.println(movablePoint1.getX());
        System.out.println(movablePoint1.getY());

        MovablePoint movablePoint2 = new MovablePoint(15,15,15,15);
        System.out.println(Arrays.toString(movablePoint2.getSpeed()));
        System.out.println(movablePoint2.move2());
        System.out.println(movablePoint2.getX());
        System.out.println(movablePoint2.getY());
    }
}