package EPAM.lesson170802.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsExamples {
    public static void main(String[] args) {
        List<Object> lis = new ArrayList<>();
        lis.add("one");
        lis.add(1);
        lis.add(null);
        lis.add(new PreGenericsExamples());

        for (Object obj : lis) {
            System.out.println(obj);
        }

        // явная проверка типа элементов коллекции
        List<String> lis1 = Collections.checkedList(new ArrayList<>(), String.class);
        //List<String> lis1 = new ArrayList<>();
        lis1.add("one");
        lis1.add("two");
        lis1.add("three");
        //lis1.add(1); // ошибка компиляции

        List l = lis1;
        l.add(1); // ошибка в RunTime

        for (Object str : lis1) {
            System.out.println(((String) str).length());
        }
        printStringLength(lis1);
    }

    private static void printStringLength(List<String> list) {
        for (String str : list) {
            // в коде, сгенерированном компилятором, cast все-таки будет присутствовать,
            // но это будет сделано автоматически
            System.out.println(str.length());
        }
    }
}
