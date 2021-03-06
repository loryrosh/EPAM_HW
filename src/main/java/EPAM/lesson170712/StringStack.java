package EPAM.lesson170712;

import java.util.Arrays;

// Ограниченный по размеру стек
public class StringStack {
    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] elements;
    private int size;

    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }

    public boolean push(String str) {
        // guard condition
        // stack overflow
        if (size >= elements.length) {
            return false;
        }
        elements[size++] = str;
        return true;
    }

    public String pop() {
        // guard condition
        // stack underflow
        if (size <= 0) {
            return null;
        }

        String result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public String tos() {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
