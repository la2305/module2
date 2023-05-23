package ss9.excercise.deploymentMethodsOfArrayListAccordingToJavaLibrary;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            System.out.println("Capacity" + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public E get(int index) {
        if (index<0 ||index>=size){
            throw new IndexOutOfBoundsException("index" +index+", size" + size);
        }
        return (E) elements[index];
     }

    public boolean add(E o) {
        ensureCapacity(size+1);
        elements[size] = o;
        size++;
        return true;
    }

    public void add(E element, int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: "+ index+", size: "+size);
        }
        ensureCapacity(size+1);
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index]=elements;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >elements.length) {
            int newSize = this.elements.length + (elements.length >>1);
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity" + minCapacity);
        }
    }
}
