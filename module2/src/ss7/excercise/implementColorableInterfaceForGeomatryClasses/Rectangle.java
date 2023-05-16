package ss7.excercise.implementColorableInterfaceForGeomatryClasses;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return this.length*this.width*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'+super.toString();
    }

    public void resize(double percent){
       this.width = this.width+(percent/100)*this.width;
       this.length = this.length+(percent/100)*this.length;
    }

}
