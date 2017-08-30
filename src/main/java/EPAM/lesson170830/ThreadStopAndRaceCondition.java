package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadStopAndRaceCondition {
    static class Modifier implements Runnable {
        private Model model;

        public Modifier(Model model) {
            this.model = model;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                model.change(i);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        Model model = new Model();

        Modifier task = new Modifier(model);

        ExecutorService service = Executors.newCachedThreadPool(); // pool потоков
        service.execute(task);
        service.execute(task);
        service.execute(task);
        service.shutdown();
        service.awaitTermination(1, TimeUnit.HOURS); // ждем завершения работы всех задач в основном потоке

        model.check();

        System.out.println("finish");
    }
}

class Model {
    int x = 0;
    int y = 0;

    synchronized public void change(int z) {
        x += z;
        y -= z;

        Utils.pause(1);
    }

    public void check() {
        if (x + y != 0) {
            throw new IllegalStateException(toString());
        }
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
