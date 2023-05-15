package ss4.excercise.Fan;

public class Test {
    public static void main(String[] args) {
        Fan fanDefault = new Fan();
        Fan fan1 = new Fan(1,true,5,"yellow");
        Fan fan2 = new Fan(2,false,10,"cyan");
        fan1.setOn(false);
        fan2.setOn(true);
        fan1.setColor("blood");
        if (fan1.isOn()){
            System.out.println("fan is on,"+"color: "+fan1.getColor()+",radius: "+fan1.getRadius()+"speed: "+fan1.getSpeed());
        } else {
            System.out.println("fan is off,"+"color: "+fan2.getColor()+",radius: "+fan2.getRadius());
        }
        if (fan2.isOn()){
            System.out.println("fan is on,"+"color: "+fan1.getColor()+",radius: "+fan1.getRadius()+"speed: "+fan1.getSpeed());
        } else {
            System.out.println("fan is off,"+"color: "+fan2.getColor()+",radius: "+fan2.getRadius());
        }
    }
}
