package ss4.excercise.BuiltClassFan;

public class Test {
    public static void main(String[] args) {
        BuiltClassFan fanDefault = new BuiltClassFan();
        BuiltClassFan fan1 = new BuiltClassFan(3,true,10,"yellow");
        BuiltClassFan fan2 = new BuiltClassFan(2,false,5,"blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
