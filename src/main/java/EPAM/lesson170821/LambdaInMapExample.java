package EPAM.lesson170821;

import java.util.Map;
import java.util.TreeMap;

public class LambdaInMapExample {
    public static void main(String[] args) {
        Map<String, String> staff = new TreeMap<>();

        staff.put("John", "Boston");
        staff.put("Mary", "New York");
        staff.put("Jack", "Boston");
        staff.put("Ann", "Moscow");
        staff.put("Clark", "Boston");
        staff.put("Ay", "SP");
        staff.put("David", "Chicago");

        // замена всех значений с помощью lambda
        staff.replaceAll((s1, s2) -> s2.toUpperCase());
        System.out.println(staff);

        // если операция очень затратная, то мы проводим эти вычисления только тогда, когда Kate действительно нет
        staff.computeIfAbsent("Kate", p -> "Paris");
        System.out.println(staff);
    }
}
