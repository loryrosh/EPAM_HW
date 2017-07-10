package EPAM.lesson170710;

public class StringLinkedList {
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
        return null;
    }

    @Override
    public String toString() {
        // TODO через StringBuilder

        // traverse
        String res = "[";

        if (first != null) {
            res += first.value;

            Node current = first.next;
            while (current != null) {
                res += ", " + current.value;
                current = current.next;
            }
        }
        return res + "]";
    }
}
