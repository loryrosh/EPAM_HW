package EPAM.lesson170714;

import java.util.Random;

public class Linkage {

    static class Processor {
        int process(int[] a) {
            int sum = 0;
            for (int value : a) {
                sum += value;
            }
            return sum;
        }
    }

    static class AnotherProcessor extends Processor {
        @Override
        int process(int[] a) {
            int sum = super.process(a);
            return -sum;
        }
    }

    static Processor proc;

    // статический инициализатор класса
    // не знаем заранее, метод какого класса будет выполнен
    static {
        Random r = new Random();
        proc = r.nextBoolean() ? new Processor() : new AnotherProcessor();
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3};

        int res = process(a); // статическое связывание (знаем, в какую конкретно точку программы нужно перескочить)
        int altRes = proc.process(a); // динамическое связывание (в момент выполнения поймем, с экземпляром какого
        // класса мы будем иметь дело и есть ли у него нужный нам метод)

        System.out.println(res);
        System.out.println(altRes);
    }

    private static int process(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }
}
