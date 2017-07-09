package EPAM.lesson170707;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("one");
        arr.add("two");
        arr.add("three");
        arr.add("three");
        arr.add("three");

        List<String> unmodifList = Collections.unmodifiableList(arr);
        unmodifList.add("one");
        unmodifList.set(0, "zero");

        System.out.println(arr);

    }
}
