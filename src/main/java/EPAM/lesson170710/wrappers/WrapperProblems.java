package EPAM.lesson170710.wrappers;

import java.util.ArrayList;
import java.util.List;

public class WrapperProblems {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0); // autoboxing: на самом деле будет new Integer(0)
        list.add(null);

        System.out.println(list);

        list.remove(new Integer(0)); // удаляем элемент со значением 0
        System.out.println(list);

        int x = list.remove(0); // удаляем нудевой элемент
        System.out.println(list);

        // int y = list.remove(0); // Null Pointer Exception
        Integer y = list.remove(0); // не возникает ошибки (просто значение null)
        System.out.println(y);
    }
}
