package EPAM.lesson170728.exceptions;

import java.math.BigDecimal;

public class UseStack {
    public static void main(String[] args) {
        StringStackWithTryCatch stack = new StringStackWithTryCatch(2);
        stack.push("one");
        stack.push("two");

        BigDecimal timing = new BigDecimal(System.nanoTime());
        System.out.println(stack.push("three"));
        System.out.println(new BigDecimal(System.nanoTime()).subtract(timing));

        boolean success = false;
        try {
            StringStackWithThrow stack1 = new StringStackWithThrow(2);
            stack1.push("one");
            //stack1.push(null);
            stack1.push("two");
            timing = new BigDecimal(System.nanoTime());
            System.out.println(stack1.push("three"));
            System.out.println(new BigDecimal(System.nanoTime()).subtract(timing));

        } catch (StringStackWithThrow.Overflow o) {
            System.err.println("Stack overflow occurred with size " + o.getMessage());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
        System.out.println(success);
    }
}
