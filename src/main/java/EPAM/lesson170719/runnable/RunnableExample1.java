package EPAM.lesson170719.runnable;

public class RunnableExample1 {
    public static void main(String[] args) {
        Runnable task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        task.run();
    }
}
