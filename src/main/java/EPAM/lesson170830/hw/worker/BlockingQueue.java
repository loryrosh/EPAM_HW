package EPAM.lesson170830.hw.worker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BlockingQueue<T> {
    Queue<T> items = new LinkedList<>();

    public List<T> getAll(Runnable poisonPill) {
        ArrayList<T> list = new ArrayList<T>();
        items.forEach(item -> {
            if (item != poisonPill) {
                list.add(item);
            }
        });
        return list;
    }

    public void put(T item) {
        synchronized (BlockingQueue.class) {

            // положили элемент в очередь
            items.offer(item);

            // подали сигнал о сделанном
            BlockingQueue.class.notify();
        }
    }

    public T take() {
        synchronized (BlockingQueue.class) {
            while (items.isEmpty()) {
                try {
                    BlockingQueue.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return items.poll();
        }
    }

    public boolean contains(T item) {
        return items.contains(item);
    }
}
