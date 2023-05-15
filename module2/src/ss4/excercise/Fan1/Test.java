package ss4.excercise.Fan1;

public class Test {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
        Fan fan1 = new Fan(4,true,5,"blood");
        Fan fan2 = new Fan(1,false,10,"cyan");
        Fan fan3 = new Fan(1,true,20,"red");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}
