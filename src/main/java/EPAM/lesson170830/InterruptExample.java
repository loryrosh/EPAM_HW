package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;

public class InterruptExample {
    public static void main(String[] args) {
        System.gc();

        // прерывание текущего потока
        Thread.currentThread().interrupt();

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        Utils.pause();
        t.interrupt();
    }
}
