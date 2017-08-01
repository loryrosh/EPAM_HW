package EPAM.lesson170731.except;

public class SimpleFinallyExample {
    public static void main(String[] args) {
        try {
            process();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void process() {
        System.out.println("start");
        try {
            System.out.println("before");
            internal();
            System.out.println("after");
        } finally {
            System.out.println("finally");
        }

        System.out.println("finish");
    }

    private static void internal() {
        throw new RuntimeException();
    }
}
