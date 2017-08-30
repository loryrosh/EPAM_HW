package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;

public class WaitNotifyExample {
    public static void main(String[] args) {
        // отдельный объект-монитор
        Object monitor = new Object();

        Thread thread = new Thread(() -> {
            System.err.println("trying to lock monitor...");
            synchronized (monitor) {
                System.err.println("locked!");
                try {
                    monitor.wait();
                    System.err.println("we were notified!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

        Utils.pause(20000);

        synchronized (monitor) {
            System.out.println("send notify...");
            monitor.notify();
            System.out.println("sleeping");
            Utils.pause(40000);
            System.out.println("awake!");
            Utils.pause(20000);
        }
    }
}
