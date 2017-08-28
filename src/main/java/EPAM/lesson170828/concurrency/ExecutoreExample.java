package EPAM.lesson170828.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutoreExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

        // выполнение задач в одном дополнительном потоке
        ExecutorService service = Executors.newFixedThreadPool(2);

        // запускает задачу на свободном потоке или запускает новый поток;
        // нет очереди выполнения, нет ожидания - ЗАДАЧИ ЗАПУСКАЮТСЯ СРАЗУ
        // ThreadPool будет жить, по умолчанию, 60 секунд
        ExecutorService service1 = Executors.newCachedThreadPool();

        for (int i = 0; i < 3; i++) {
            int tmp = i;
            service.execute(() -> {
                Utils.pause(3000);
                System.out.println("Hello, world!  task: " + tmp);
            });
        }

        service.shutdown();

        boolean success = service.awaitTermination(1, TimeUnit.HOURS);
        System.out.println("finish " + success);
    }
}
