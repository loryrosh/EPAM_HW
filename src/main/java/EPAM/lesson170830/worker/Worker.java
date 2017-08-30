package EPAM.lesson170830.worker;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {
    // poison pill - когда она появляется в очереди, поток "умирает"
    // задача, которая ничего не обрабатывает
    static final Runnable POISON_PILL = () -> {
    };

    BlockingQueue<Runnable> tasks = new BlockingQueue<>();

    public Worker() {
        new Thread(this::processTasks).start();
    }

    @Override
    public void execute(Runnable command) {
        tasks.put(command);
    }

    public void shutdown() {
        tasks.put(POISON_PILL);
    }

    public List<Runnable> shutdownNow() {
        return null;
    }

    private void processTasks() {
        while (true) {
            Runnable task = tasks.take();

            // проверяем по адресу объекта, который присутствует у нас в единственном экземпляре
            if (task == POISON_PILL)
                return;

            // проверка на пустоту tasks
            Optional.of(task).ifPresent(Runnable::run);
        }
    }
}
