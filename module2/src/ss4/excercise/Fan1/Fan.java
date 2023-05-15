package ss4.excercise.Fan1;

public class Fan {
    private int slow = 1;
    private int medium =2;
    private int fast =3;
    private int speed = slow;
    private boolean onOrOff = false;
    private double radius =5;
    private String color ="blue";
    public Fan(){

    }
    public Fan(int speed, boolean onOrOFF,double radius,String color ){
        this.speed =speed;
        onOrOff = onOrOFF;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public boolean getOnOrOff(){
        return onOrOff;
    }
    public void setOnOrOff( boolean onOrOff){
        this.onOrOff=onOrOff;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String toString(){
        if (onOrOff){
            return "fan is on, "+"speed: "+this.speed+", color: "+this.color+", radius: "+this.radius;
        } else {
            return "fan is off, "+"color: "+this.color+", radius: "+this.radius;

        }
    }
}
