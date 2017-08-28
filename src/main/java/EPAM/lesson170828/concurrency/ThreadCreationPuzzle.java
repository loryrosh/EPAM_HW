package EPAM.lesson170828.concurrency;

public class ThreadCreationPuzzle {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello, lambda!");
        }) {
            @Override
            public void run() {
                System.out.println("Hello, world!"); // выполнится это, а не lambda - мы переопределили поведение run()
            }
        }.start();
    }
}
