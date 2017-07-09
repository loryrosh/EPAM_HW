package EPAM.lesson170707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("three");
        arr.add("three");
        System.out.println(arr);

        ArrayList arr1 = new ArrayList() {{ // анонимный класс + блок инициализации
            add("one");
            add("two");
            add("three");
        }};

        // нельзя удалить или добавить
        // можно изменить
        List list2 = Arrays.asList("one", "two", "three");
        //list2.add("gsd");
        //list2.remove("one");
        list2.set(0, "Один");
        System.out.println(list2);


        boolean success = arr.remove("three");
        arr.remove(new String("three")); // из списка удаляется объект, РАВНЫЙ тому, который мы указали
        System.out.println(arr + " " + success);

        String three = new String("three");
        System.out.println("three" + " equals " + three + ": " + "three".equals(three));

    }
}
