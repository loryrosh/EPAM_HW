package EPAM.lesson170726.interfaces;

import java.util.Iterator;

public class StringLinkedList implements Iterable<String> {
    public static class Node {
        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node first;
    Node last;
    int size;

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public boolean remove(String value) {
        boolean res = false;
        Node current = first;
        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                // removing
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;

                    if (current.next == null) {
                        last = prev;
                    }
                }
                size--;
                res = true;
                break;
            }
            prev = current;
            current = current.next;
        }

        if (first == null) {
            last = null;
        }
        return res;
    }

    public String remove(int i) {
        if (i < 0 || i >= size)
            return null;

        Node current = first;
        Node prev = null;
        String res = null;
        int idx = 0;

        while (current != null) {
            if (idx == i) {
                // removing
                if (prev == null) { // removing the first element
                    first = current.next;
                } else {
                    prev.next = current.next;

                    if (current.next == null) {
                        last = prev;
                    }
                }
                size--;
                res = current.value;
                break;
            }
            prev = current;
            current = current.next;
            idx++;
        }

        if (first == null) {
            last = null;
        }
        return res;
    }

    @Override
    public String toString() {
        // traverse
        StringBuilder res = new StringBuilder("[");

        if (first != null) {
            res.append(first.value);

            Node current = first.next;
            while (current != null) {
                res.append(", ").append(current.value);
                current = current.next;
            }
        }
        res.append("]");
        return res.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            Node nextNotProcessedNode = first;

            @Override
            public boolean hasNext() {
                return nextNotProcessedNode != null;
            }

            @Override
            public String next() {
                String result = nextNotProcessedNode.value;
                nextNotProcessedNode = nextNotProcessedNode.next;
                return result;
            }
        };
    }
}
