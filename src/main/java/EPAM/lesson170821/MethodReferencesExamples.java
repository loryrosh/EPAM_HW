package EPAM.lesson170821;

import java.util.function.Function;

public class MethodReferencesExamples {
    public static void main(String[] args) {
        Function<String, Integer> strignLength = s -> s.length();
        Function<String, Integer> strignLength1 = String::length;

        Runnable r = () -> Thread.currentThread().dumpStack();
        Runnable r2 = Thread::dumpStack;

        // явно описываем объект, к методу которого обращаемся
        Runnable r3 = () -> Thread.currentThread().getName();
        Runnable r4 = Thread.currentThread()::getName;
    }
}
