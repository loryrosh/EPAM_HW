package EPAM.lesson170821;

public class EffectivelyFinalVariables {
    static int z = 1000;

    public static void main(String[] args) {
        int x = 10;

        Runnable procedure = new Runnable() {
            @Override
            public void run() {
                pause(10000);

                // Runnable - это объект
                // при передаче параметра по значению происходит копирование
                // появится неявная локальная переменная int x = main.x для x из внешнего контекста
                System.out.println(x);

                // запрещается менять значение переменных из внешнего контекта - они final
                // x = 20; !!!

                // это не локальная переменная, а поле класса
                // можно работать напрямую; _не_ должно быть final
                z = 10;
            }
        };

        new Thread(procedure).start();
        pause(10000);
        System.out.println("finish");

        // в конце main локальная переменная x должна исчезнуть
    }

    private static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
