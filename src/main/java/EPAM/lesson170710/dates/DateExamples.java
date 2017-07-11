package EPAM.lesson170710.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateExamples {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        LocalDate birth = LocalDate.of(1963, 12, 17); // - получить нужную дату по некоторым параметрам
        System.out.println(birth.compareTo(LocalDate.now()));
    }
}
