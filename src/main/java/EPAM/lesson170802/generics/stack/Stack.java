package EPAM.lesson170802.generics.stack;

import java.util.Arrays;

// параметризация класса (используем Generics)
public class Stack<E> {
    private static final int DEFAULT_MAX_SIZE = 3;
    private final E[] elements;
    private int size;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        elements = (E[]) new String[maxSize];
        size = 0;
    }

    public boolean push(E str) {
        // guard condition
        // stack overflow
        if (size >= elements.length) {
            return false;
        }
        elements[size++] = str;
        return true;
    }

    public E pop() {
        // guard condition
        // stack underflow
        if (size <= 0) {
            return null;
        }

        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public E tos() {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
