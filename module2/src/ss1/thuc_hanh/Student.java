package ss1.thuc_hanh;

public class Student {
     String name;
    private int age;
    private String sex;
    private double point;

    void xuatdoituong(){
        System.out.println(name);

    }
     void eating(){
        System.out.println(this.name +"đang ăn"+this.sex);;
    }
    public void playing(){
        System.out.println(this.name+"đang sex");
    }

}
