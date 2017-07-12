package EPAM.lesson170712.hw;

import EPAM.lesson170712.StringStack;
import EPAM.mytestframework.Asserts;

public class UseStackTDD {
    public static void main(String[] args) {
        StringStack stack = new StringStack();

        System.out.println(stack);
        System.out.println(Asserts.assertEquals(stack.size(), 0));

        try {
            stack.pop();
        } catch (Exception ex) {
            System.out.println(Asserts.assertHasException(new NullPointerException()));
        }

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println(stack);
        System.out.println(Asserts.assertEquals(stack.size(), 3));

        System.out.println(Asserts.assertEquals(stack.pop(), "three"));
        System.out.println(Asserts.assertEquals(stack.tos(), "two"));
        System.out.println(Asserts.assertEquals(stack.push("four"), true));
        System.out.println(Asserts.assertEquals(stack.size(), 3));
    }
}
