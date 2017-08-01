package EPAM.lesson170731.except;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FinallyExamples {
    static class Counter {
        int count;
        Lock lock = new ReentrantLock();

        private void inc() {
            lock.lock();
            try {
                internal();
            } finally {
                lock.unlock();
            }
        }

        private void internal() {
            int register = count;
            register++;
            count = register;
        }

        public int get() {
            lock.lock();

            try {
                return count;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            while (true) {
                counter.inc();
                System.out.println(counter.get());

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
