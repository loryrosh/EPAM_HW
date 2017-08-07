package EPAM.lesson170807;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            m();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        m2(); // не обязаны проверять RuntimeException
    }

    private static void m2() throws RuntimeException {

    }

    private static void m() throws Exception {

    }
}
