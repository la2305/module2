package ss9.excercise.deploymentMethodsOfArrayListAccordingToJavaLibrary;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        checkIndex(index);
        this.add(null);
        for (int i = size - 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
    }

    public void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("index: " + i + ", size " + i);
        }
        return (E) elements[i];
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacityForAdd(1);
        }
        elements[size++] = e;
        return true;
    }

    public void ensureCapacityForAdd(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }
}

