package ss11.practice.employmentStackUseClassLinkedListInLibraryOfJava;

public class GenericStackClient {
    public static void main(String[] args) {
        stackOfString();
    }
    public static void stackOfString(){
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("một");
        myGenericStack.push("hai");
        myGenericStack.push("ba");
        myGenericStack.push("bốn");
        myGenericStack.push("năm");
        System.out.println("size of inlements in array: "+ myGenericStack.size());
        while (!myGenericStack.isEmpty()){
            System.out.println(myGenericStack.pop());;
        }
        System.out.println("size of inlements in array: "+myGenericStack.size());
    }
    public static void stackOfInteger(){

    }
}
