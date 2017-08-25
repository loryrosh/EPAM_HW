package EPAM.lesson170825.traders;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

// статический импорт

public class UseTrader {

	/*
     *
	 * 1 Find all transactions in the year 2011 and sort them by value (small to
	 * high).
	 *
	 * 2 What are all the unique cities where the traders work?
	 *
	 * 3 Find all traders from Cambridge and sort them by name.
	 *
	 * 4 Return a string of all traders’ names sorted alphabetically.
	 *
	 * 5 Are any traders based in Milan?
	 *
	 * 6 Print all transactions’ values from the traders living in Cambridge.
	 *
	 * 7 What’s the highest value of all the transactions?
	 *
	 * 8 Find the transaction with the smallest value.
	 */

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

        traders.stream()
                .map(Trader::getName)
                .forEach(System.out::println);

        List<String> traderNames = traders.stream()
                .map(Trader::getName)
                .collect(toList());
        System.out.println(traderNames);


        // 1 Find all transactions in the year 2011 and sort them by value (small to high).
        List<Transaction> res = transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                //.sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());
        System.out.println(res);

        // 2 What are all the unique cities where the traders work?
        List<String> cities = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(cities);


        // 3 Find all traders from Cambridge and sort them by name.
        List<Trader> res1 = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(t -> t.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(res1);

        // 4 Return a string of all traders’ names sorted alphabetically.
        String res2 = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .map(Trader::getName)
                //.peek(System.out::println) - вывод промежуточных результатов
                .sorted()
                // вариант через reduce()
                //.reduce("", (s, t) -> s + " " + t);
                //.collect(Collectors.joining()); // собирает в строку все элементы
                .collect(Collectors.joining(", ")); // разделение элементов при сборе в строку
        System.out.println(res2);

        // 5 Are any traders based in Milan?
        boolean res3 = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .anyMatch(t -> t.getCity().equals("Milan"));
        System.out.println(res3);

        // 6 Print all transactions’ values from the traders living in Cambridge.
        System.out.println(
                transactions.stream()
                        .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                        .map(Transaction::getValue)
                        .collect(Collectors.toList())
        );

        // 7 What’s the highest value of all the transactions?
        Optional<Integer> res4 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        res4.ifPresent(System.out::println);

        // 8 Find the transaction with the smallest value.
        Optional<Transaction> res5 = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        res5.ifPresent(System.out::println);
    }
}
