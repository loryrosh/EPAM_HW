package EPAM.lesson170629.theory.classtructure;

public class SyncExample {
    // синхронизация для статического метода
    static void classMethod() {
        synchronized (SyncExample.class) { // синхронизация по объекту Class

        }
    }

    // синхронизация для метода экземпляра класса
    void instanceMethod() {
        synchronized (this) { // синхронизация по экземпляру класса SyncExample

        }
    }
}
