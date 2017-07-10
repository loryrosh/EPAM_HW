package EPAM.lesson170710.dates;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;

public class StopWatch {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant stop = Instant.now();

        Duration elps = Duration.between(start, stop);
        System.out.println(elps.getSeconds());
        System.out.println(elps.getNano());
        System.out.println(elps.toMillis());

        BigDecimal timing = new BigDecimal(System.nanoTime());
        System.out.println(new BigDecimal(System.nanoTime()).subtract(timing));

        // лучше использовать JMH
    }
}
