package EPAM.lesson170719.inheritance;

import java.util.ArrayDeque;

public class ArrayStackOfStrings extends ArrayDeque {
    @Override
    public void addLast(Object o) {
        throw new UnsupportedOperationException(); // запрещаем использовать родительское поведение по умолчанию
    }

    @Override
    public Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        ArrayStackOfStrings stack = new ArrayStackOfStrings();
        stack.add("one");
    }
}
