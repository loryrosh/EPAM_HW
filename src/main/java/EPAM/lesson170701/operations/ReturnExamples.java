package EPAM.lesson170701.operations;

import java.util.Random;

public class ReturnExamples {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Usage...");
            return;
        }
        int x = m();

        return;
    }

    private static int m() {
        int result = 0;

        Random r = new Random();
        if (r.nextBoolean()) {
            return 10;
        }
        return result;
    }
}
