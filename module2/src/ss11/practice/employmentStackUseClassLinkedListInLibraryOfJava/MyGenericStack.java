package ss11.practice.employmentStackUseClassLinkedListInLibraryOfJava;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        this.stack = new LinkedList<>();
    }
    public void push(T element){
        stack.push(element);
    }
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size()==0){
            return true;
        }
        return false;
    }
}
