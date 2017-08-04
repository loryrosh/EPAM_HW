package EPAM.lesson170804.generics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsExample {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.4, 2.2, 3.4);

        printNums(ints);
        printNums(doubles);

        List<Number> nums = new ArrayList<>();
        fill(nums);

        List<Integer> integs;
        // fill(integs);
    }

    // lower bound
    private static void fill(List<? super Number> nums) { // можно делать сохранение (операция store)
        nums.add(1.36);
        nums.add(1);
        nums.add(3.5f);

        Integer obj = (Integer) nums.get(1); // необходимо будет делать cast
    }

    // upper bound
    private static void printNums(List<? extends Number> nums) { // можно делать extract (только извлекать значения)
        for (Number num : nums) {
            System.out.println(num);
        }

        // nums.add(1.45); // ERROR ; storing values is forbidden
    }
}
