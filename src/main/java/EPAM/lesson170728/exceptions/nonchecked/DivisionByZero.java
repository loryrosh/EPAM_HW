package EPAM.lesson170728.exceptions.nonchecked;

public class DivisionByZero {
    public static void main(String[] args) {
        int res = divide(10, 0);
        System.out.println(res);
    }

    private static int divide(int i, int j) {
        try {
            return i / j;
        } catch (Exception ex) {
            ex.printStackTrace();
            return Integer.MAX_VALUE;
        }
    }
}
