package ss7.excercise.implementResiableInterfaceForGeometryClasses;


public class Square extends Shape implements Colorable {
    private double edge = 1.0;
    public Square(){

    }
    public Square(double edge){
        this.edge = edge;
    }
    public Square(String color,boolean filled, double edge){
        super(color, filled);
        this.edge =edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return this.edge*this.edge;
    }
    public double getPerimeter(){
        return this.edge*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                '}'+super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Square:  Color all four sides..");
    }
}
