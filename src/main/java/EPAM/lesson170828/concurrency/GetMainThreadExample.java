package EPAM.lesson170828.concurrency;

public class GetMainThreadExample {
    public static void main(String[] args) {
        new Thread(() -> {
            // ссылка на текущий поток
            Thread current = Thread.currentThread();

            // группа текущего потока
            ThreadGroup threadGroup = current.getThreadGroup();

            // количество потоков в группе
            Thread[] threads = new Thread[threadGroup.activeCount()];

            // штератор по потокам
            threadGroup.enumerate(threads);

            for (Thread thread : threads) {
                System.out.println(thread);
            }

            Utils.pause(3000);
        }).start();
    }
}
