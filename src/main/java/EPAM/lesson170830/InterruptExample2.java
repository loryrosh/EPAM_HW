package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;

public class InterruptExample2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t = new Thread(counter);
        t.start();

        Utils.pause(3000);
        counter.shutdown();
    }
}

class Counter2 implements Runnable {
    // медленне, чем с полем volatile "stop"
    // но можно "резко вывести поток из сна"
    private Thread currentThread;

    @Override
    public void run() {
        currentThread = Thread.currentThread();
        long count = 0;
        while (!Thread.interrupted()) {
            count++;
        }

        System.out.println(count);
    }

    public void shutdown() {
        currentThread.interrupt();
    }
}
