package EPAM.lesson170830.worker;

public class UseWorker {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.execute(() -> System.out.print("Hello, "));
        worker.execute(() -> System.out.print("world!"));

        worker.shutdown();
    }
}
