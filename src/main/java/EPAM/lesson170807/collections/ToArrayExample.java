package EPAM.lesson170807.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three");
        System.out.println(list.getClass());
        //list.add("one");
        //list.add("two");
        //list.add("three");


        Object[] arr = list.toArray(); // array of objects

        // вызываем метод toArray(T[] a)
        // указываем, какого типа нам нужен массив!!!!! (это делается через System.arraycopy)
        String[] res = list.toArray(new String[0]); // конструкция "new String[0]" задает тип массива !!!!!
        System.out.println(Arrays.toString(res));

        List<String> anotherList = new ArrayList<>();
        anotherList.add("four");
        anotherList.add("five");
        list.addAll(anotherList);
        System.out.println(list);
        list.clear();


        List<String> arr1 = Arrays.asList("one", "two", "three");
        list.addAll(arr1);
        System.out.println(list);

        List<String> arr2 = Arrays.asList("one", "two", "three");
        list.addAll(arr2);
        System.out.println(list);
    }
}
