package EPAM.lesson170627.theory.creation;

public class Singleton {
    static private Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton get() {
        return instance;
    }

    public void doIt() {
        System.out.println("Did it!");
    }
}
