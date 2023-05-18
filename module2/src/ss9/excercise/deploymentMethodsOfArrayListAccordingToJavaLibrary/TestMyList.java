package ss9.excercise.deploymentMethodsOfArrayListAccordingToJavaLibrary;

public class TestMyList {
    public static void main(String[] args) {
        MyList <Integer> list = new MyList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7,3);
        list.add(4,4);
        System.out.println(list.get(3));
        list.clear();
        System.out.println(list.get(3));
    }
}
