package EPAM.lesson170731.except;

import java.util.Random;

public class MultiCatchExample {
    public static void main(String[] args) {
        System.out.println("start");

        try {
            process();

        } catch (IllegalArgumentException | ArithmeticException | NullPointerException ex) {
            System.err.println(ex.getClass().getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("end");
    }

    private static void process() {
        Random r = new Random();
        int state = r.nextInt(5);

        switch (state) {
            case 0:
                throw new IllegalArgumentException();
            case 1:
                throw new NullPointerException();
            case 2:
                throw new ArithmeticException();
            case 3:
                throw new RuntimeException("random");
        }
    }
}
