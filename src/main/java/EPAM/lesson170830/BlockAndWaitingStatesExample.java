package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;

public class BlockAndWaitingStatesExample {
    public static void main(String[] args) {
        // отдельный объект-монитор
        Object monitor = new Object();

        Thread thread = new Thread(() -> {
            System.err.println("trying to lock monitor...");
            synchronized (monitor) {
                System.err.println("locked!");
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        synchronized (monitor) {
            System.out.println("starting another thread...");
            thread.start();

            System.out.println("sleeping...");
            Utils.pause(1000);
            System.out.println(thread.getState());
            Utils.pause(4000);

            System.out.println("awake!");
        }
    }
}
