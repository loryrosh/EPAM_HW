package EPAM.lesson170707.hw;

import java.util.Arrays;

public class StringArrayList {
    public static final int DEFAULT_SIZE = 2;

    String[] elements = new String[DEFAULT_SIZE];
    int size = 0;

    public void add(String string) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
    }

    public void remove(int i) {
        if (isWrongPos(i)) {
            return;
        }

        System.arraycopy(elements, i + 1, elements, i, --size - i);
        elements[size] = null;
    }

    public String get(int i) {
        if (isWrongPos(i)) {
            return "";
        }
        return elements[i];
    }

    public String set(int i, String newStr) {
        if (isWrongPos(i)) {
            return "";
        }

        String prevElem = elements[i];
        elements[i] = newStr;

        return prevElem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String res = "[";

        if (elements[0] != null)
            res += elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (elements[i] != null) {
                res += ", " + elements[i];
            }
        }
        return res + "]";
    }

    private boolean isWrongPos(int i) {
        return (i >= size || i < 0);
    }
}
