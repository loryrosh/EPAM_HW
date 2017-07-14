package EPAM.lesson170712.encapsulation;

public class OldApproach {
    static class Stack {
        static String[] elements;
        static int size;
    }

    public static boolean push(Stack This, String str) {
        // guard condition
        // stack overflow
        if (This.size >= This.elements.length) {
            return false;
        }
        This.elements[This.size++] = str;
        return true;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        push(stack, "one");
    }
}
