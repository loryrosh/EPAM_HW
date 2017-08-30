package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;

public class VisibilityAndVolatile {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t = new Thread(counter);
        t.start();

        Utils.pause(5000);
        counter.shutdown();
    }
}

class Counter implements Runnable {
    // заставляет брать "свежие" изменения значения переменной из RAM, а не из кэша
    volatile boolean stop = false;

    @Override
    public void run() {
        long count = 0;
        while (!stop) {
            count++;
        }

        System.out.println(count);
    }

    public void shutdown() {
        stop = true;
    }
}
