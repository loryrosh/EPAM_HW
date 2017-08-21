package EPAM.lesson170821;

public class AnonymousAsLambdaDemo {
    public static void main(String[] args) {
        // интерфейс для выполнения некой ПРОЦЕДУРЫ, которую можно будет запустить из другого места кода
        Runnable procedure = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        Runnable procedure2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from 2");
            }
        };

        process(procedure);
        process(procedure2);

        algorithm(procedure, procedure2);
    }

    // обобщенный код, который описывает последовательность действий некого алгоритма
    private static void algorithm(Runnable step1, Runnable step2) {
        step1.run();
        step2.run();
    }

    private static void process(Runnable procedure) {
        procedure.run();
    }
}
