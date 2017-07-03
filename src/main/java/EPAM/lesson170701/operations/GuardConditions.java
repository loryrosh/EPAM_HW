package EPAM.lesson170701.operations;

public class GuardConditions {
    public static void main(String[] args) {
        m(10);
    }

    private static void m(int i) {
        // Набор Guard conditions (выполнение "контрактных" условий)
        if (i < 0) {
            return;
        }
        if (i % 2 != 0) {
            return;
        }
        if (i >= 100) {
            return;
        }

        // код нормального выполнения
    }
}
