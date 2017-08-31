package EPAM.lesson170830.hw.worker;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {
    static final Runnable POISON_PILL = () -> {
    };

    final BlockingQueue<Runnable> tasks = new BlockingQueue<>();
    Thread workerThread = null;

    public Worker() {
        workerThread = new Thread(this::processTasks);
        workerThread.start();
    }

    @Override
    public void execute(Runnable command) throws IllegalStateException {
        if (!workerThread.isAlive()) {
            throw new IllegalStateException("Error! Worker service is not active any more.");
        }

        if (!tasks.contains(POISON_PILL)) {
            tasks.put(command);
        } else {
            throw new IllegalStateException("Error! Thread shutdown has been received earlier.");
        }
    }

    public void shutdown() {
        if (workerThread.isAlive()) {
            tasks.put(POISON_PILL);
        }
    }

    public Optional<List<Runnable>> shutdownNow() {
        Optional<List<Runnable>> leftTasks = Optional.empty();
        if (workerThread.isAlive()) {
            leftTasks = Optional.ofNullable(tasks.getAll(POISON_PILL));
            workerThread.stop();
        }
        return leftTasks;
    }

    private void processTasks() {
        while (workerThread.isAlive()) {
            Runnable task = tasks.take();

            // проверяем по адресу объекта, который присутствует у нас в единственном экземпляре
            if (task == POISON_PILL)
                return;

            // проверка на пустоту tasks
            if (task != null) {
                task.run();
            }
        }
    }
}
