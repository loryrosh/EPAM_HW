package EPAM.lesson170821;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> strSupp = () -> "Hello";

        // эти 3 варианты эквивалентны
        Supplier<LocalDate> dataSupp2 = new Supplier<LocalDate>() { // анонимный класс
            @Override
            public LocalDate get() {
                return LocalDate.now();
            }
        };
        Supplier<LocalDate> dataSupp1 = () -> LocalDate.now(); // лямбда
        // ссылка на метод, который автоматически компилруется потом в лямбда-выражение
        Supplier<LocalDate> dataSupp = LocalDate::now;

        Supplier<ArrayList<String>> arr = new Supplier<ArrayList<String>>() {
            @Override
            public ArrayList<String> get() {
                return null;
            }
        };

        Supplier<ArrayList<String>> arr1 = () -> new ArrayList<>();
        Supplier<ArrayList<String>> arr2 = ArrayList::new;
    }
}
