package EPAM.lesson170828.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutors {
    public static void main(String[] args) {
        // отдельный интерфейс
        // задаем только расписание задач
        // а на выполнение мы отдаем это расписание уже ральному Executor-у
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        // реальное выполнение задач
        ExecutorService realService = Executors.newCachedThreadPool();

        service.execute(() -> {
            System.out.println("hello");
        });

        // выполнить задачу через 5 сек (отложенный вызов)
        service.schedule(() -> {
            System.out.println("hi there");
        }, 5, TimeUnit.SECONDS);

        // выполняется через определенные промежутки времени
        // время с момента начала задачи
        // [-----]
        // <----->[-----]
        //               [-----]
        service.scheduleAtFixedRate(() -> {
            System.out.println("aha");
        }, 1, 1, TimeUnit.SECONDS);

        // время после окончания задачи и до начала следующей задачи
        // [-----]
        //        <----->[-----]
        service.scheduleWithFixedDelay(() -> {
            System.out.println("ку-ку");
        }, 1, 1, TimeUnit.SECONDS);
    }
}
