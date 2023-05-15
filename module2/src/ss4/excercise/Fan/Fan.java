package ss4.excercise.Fan;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;

    private double radius;
    private String color;

    public Fan() {
        this.speed = MEDIUM;
        on = true;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean isOn, double radius, String color) {
        this.speed = speed;
        on = isOn;
        this.radius = radius;
        this.color = color;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
