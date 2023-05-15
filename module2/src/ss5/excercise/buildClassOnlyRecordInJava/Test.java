package ss5.excercise.buildClassOnlyRecordInJava;

public class Test {
    public static void main(String[] args) {
        Student studentDefault = new Student();
        System.out.println(studentDefault.toString());
        studentDefault.setClasses("C03");
        studentDefault.setName("La");
        System.out.println(studentDefault.toString());
        studentDefault.setName("Bi");
        studentDefault.setClasses("C04");
        System.out.println(studentDefault.toString());
    }
}
