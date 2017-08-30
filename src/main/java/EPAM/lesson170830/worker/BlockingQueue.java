package EPAM.lesson170830.worker;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {
    Queue<T> items = new LinkedList<>();

    public void put(T item) {
        synchronized (items) {

            // положили элемент в очередь
            items.offer(item);

            // подали сигнал о сделанном
            items.notify();
        }
    }

    public T take() {
        synchronized (items) {
            // цикл while, а не if, так как может возникнуть ситуация spurious wake-up
            while (items.isEmpty()) {
                try {
                    items.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return items.poll();
        }
    }
}
