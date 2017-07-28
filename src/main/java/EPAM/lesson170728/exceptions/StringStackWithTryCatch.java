package EPAM.lesson170728.exceptions;

import java.util.Arrays;

// Ограниченный по размеру стек
public class StringStackWithTryCatch {
    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] elements;
    private int size;

    public StringStackWithTryCatch() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStackWithTryCatch(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }

    public boolean push(String str) {
        try {
            elements[size++] = str;
        } catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }
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
