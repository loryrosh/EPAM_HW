package EPAM.lesson170728.exceptions;

import java.util.Arrays;

// Ограниченный по размеру стек
public class StringStackWithThrow {
    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] elements;
    private int size;

    public static class Overflow extends Exception {
        private int size2;

        public Overflow(int size) {
            size2 = size;
        }

        public int getSize() {
            return size2;
        }
    }

    public StringStackWithThrow() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStackWithThrow(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }

    public boolean push(String str) throws Exception {
        if (str == null) {
            throw new IllegalArgumentException("nulls not allowed");
        }

        if (size >= elements.length) {
            throw new Overflow(size);
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
