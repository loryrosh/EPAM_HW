package EPAM.lesson170828.concurrency;

public class ThreadCreationExamples {
    public static void main(String[] args) {
        // через lambda
        new Thread(() -> {
            System.out.println("Hello, world, I'm lambda!"); // lambda реализует интерфейс Runnable (void -> void)
        }).start();

        // через анонимный класс
        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello, world, I am anonym!");
            }
        }.start();

        new MyThread().start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
}
