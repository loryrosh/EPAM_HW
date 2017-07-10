package EPAM.lesson170710;

public class Node {
    // POJO class
    // Plain Old Java Object

    String value;
    Node next;

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
}
