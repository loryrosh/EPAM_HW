package EPAM.lesson170828.concurrency;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExamples {
    public static void main(String[] args) {
        System.out.println("start");

        // выполнение задач в одном дополнительном потоке
        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service1 = Executors.newFixedThreadPool(2);

        service.execute(() -> {
            Utils.pause();
            System.out.println("Hello, world!");
        });

        service.execute(() -> {
            Utils.pause();
            System.out.println("Hello, world!");
        });

        service.execute(() -> {
            Utils.pause();
            System.out.println("Hello, world!");
        });
        System.out.println("finish");

        // останавливаем Executor
        service.shutdown();

        for (int i = 0; i < 5; i++) {
            // создаем временную локальную переменную (так как i должна быть effectively final)
            int tmp = i; // !!!
            service.execute(() -> {
                Utils.pause();
                System.out.println("Hello, world!  task: " + tmp);
            });
        }

        // немедленное закрытие Executor - возвращает список еще не выполненных задач;
        // при этом возникает InterraptedException, так как в задачах мы делаем Thread.sleep()
        List<Runnable> tasksLeft = service1.shutdownNow();
    }
}
