package ss11.practice.employmentStackUseClassLinkedListInLibraryOfJava;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfIsString();
    }
    private static void stackOfIsString(){
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("một");
        myGenericStack.push("hai");
        myGenericStack.push("ba");
        myGenericStack.push("bốn");
        myGenericStack.push("năm");
        System.out.println("1.1 Size of stack after push operations: "+ myGenericStack.size());
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop());;
        }
        System.out.println("Size of stack after pop operations : "+myGenericStack.size());

    }
}
