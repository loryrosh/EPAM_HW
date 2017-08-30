package EPAM.lesson170830;

public class RaceConditionExample {
    static int count = 0;

    static class Counter implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                // mutex: mutual exclusion
                // Mutex-ом может быть любой объект в Java
                synchronized (this) {
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter task = new Counter();

        Thread thread = new Thread(task);
        thread.start();

        Thread thread2 = new Thread(task);
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println(count);
    }
}
