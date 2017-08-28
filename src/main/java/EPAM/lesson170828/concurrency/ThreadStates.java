package EPAM.lesson170828.concurrency;

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        for (Thread.State state : Thread.State.values()) {
            System.out.println(state);
        }

        System.out.println();
        Thread t = new Thread();
        System.out.println(t.getState());

        System.out.println();
        t = new Thread(() -> {
            System.out.println("");
        });

        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());

        // получаем ссылку на текущий поток
        Thread main = Thread.currentThread();
        System.out.println(main.toString());

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread());
            Utils.pause(5000);
        });
        t2.start();

        // главный поток ожидает выполнения t2
        System.out.println("joining");
        t2.join();
        System.out.println("joined");

        System.out.println(t2.getState());
    }
}
