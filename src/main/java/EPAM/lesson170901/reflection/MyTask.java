package EPAM.lesson170901.reflection;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Hi from me!");
    }
}
