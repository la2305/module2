package ss4.excercise.BuiltClassFan;

public class BuiltClassFan {
    private final int slow = 1;
    private final int medium = 2;
    private final int fast = 3;

    private int speed;
    private boolean onAndFfo;
    private double radius;
    private String color;

    public BuiltClassFan() {
        this.speed = slow;
        onAndFfo = false;
        this.radius = 5;
        this.color = "blue";
    }

    public BuiltClassFan(int speed, boolean onFfo, double radius, String color) {
        this.speed = speed;
        onAndFfo = onFfo;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOnAndFfo() {
        return onAndFfo;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOnAndFfo(boolean onAndFfo) {
        this.onAndFfo = onAndFfo;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (onAndFfo == true) {
            return "fan is on," + " speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius;
        } else {
            return "fan is off," + " color: " + this.color + ", radius: " + this.radius;
        }
    }
}


