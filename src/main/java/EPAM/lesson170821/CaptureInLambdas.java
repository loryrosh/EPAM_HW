package EPAM.lesson170821;

public class CaptureInLambdas {
    public static void main(String[] args) {
        X x = new X();
        x.m(30);
    }
}

class X {
    static int classField = 30;

    int instanceField;

    void m(int formalParam) {
        int localVariable = 10;

        Runnable r = () -> {
            // localVariable и formalParam - effectively final
            // instanceField и classField - нет -> можно их менять
            System.out.println(localVariable + formalParam + instanceField + classField);

            instanceField = 0;
            classField = 0;

            // localVariable = 0;
            // formalParam = 0;
        };

        r.run();
    }
}
