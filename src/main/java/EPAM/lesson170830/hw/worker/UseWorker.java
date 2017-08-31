package EPAM.lesson170830.hw.worker;

import java.util.List;
import java.util.Optional;

public class UseWorker {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.execute(() -> System.out.print("Hello, "));
        worker.execute(() -> System.out.println("world!"));

        worker.shutdown();

        try {
            worker.execute(() -> System.out.println("ha-ha!"));
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }

        Optional<List<Runnable>> leftTasks = worker.shutdownNow();
        leftTasks.ifPresent(UseWorker::printTasks);

        try {
            worker.execute(() -> System.out.println("new task!"));
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private static void printTasks(List<Runnable> leftTasks) {
        System.out.println(leftTasks.size());
        for (Runnable task : leftTasks) {
            System.out.print("{\n");
            task.run();
            System.out.print("\n}");
        }
    }
}
