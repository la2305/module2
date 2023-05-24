package ss9.excercise.deploymentMethodsOfArrayListAccordingToJavaLibrary;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(1,3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.clear();

        list.add(1);
        list.add(2);
        list.add(1,3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
