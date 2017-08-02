package EPAM.lesson170802.generics;

import java.util.ArrayList;
import java.util.List;

public class PreGenericsExamples {
    public static void main(String[] args) {
        List lis = new ArrayList<>();
        lis.add("one");
        lis.add(1);
        lis.add(null);
        lis.add(new PreGenericsExamples());

        for (Object obj : lis) {
            System.out.println(obj);
        }

        List lis1 = new ArrayList<>();
        lis1.add("one");
        lis1.add("two");
        lis1.add("three");

        for (Object str : lis1) {
            System.out.println(((String) str).length());
        }

        printStringLength(lis1);
    }

    private static void printStringLength(List list) {
        for (Object obj : list) {
            if (obj instanceof String) {
                String s = (String) obj;
                System.out.println(s.length());
            }
        }
    }
}
