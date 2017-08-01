package EPAM.lesson170731.except;

public class FinallyExample2 {
    public static void main(String[] args) {
        int r = get();
        System.out.println(r);
    }

    private static int get() {
        try {
            int x = 10 / 0;
            return 0;
        } catch (Exception ex) {
            return calculateRes();
        } finally {
            return 20;
        }
    }

    private static int calculateRes() {
        System.out.println("calc");
        return 10;
    }
}
