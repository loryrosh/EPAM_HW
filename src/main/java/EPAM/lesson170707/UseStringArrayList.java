package EPAM.lesson170707;

import EPAM.mytestframework.Asserts;

public class UseStringArrayList {
    public static void main(String[] args) {
        StringArrayList list = new StringArrayList();
        System.out.println(Asserts.assertEquals(list.isEmpty(), true));

        list.add("one");
        System.out.println(list);

        list.add("two");
        list.add("three");
        System.out.println(list);

        list.add("four");
        list.add("five");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);


        System.out.println(Asserts.assertEquals(list.isEmpty(), false));
        System.out.println(Asserts.assertEquals(list.size, 4));
        System.out.println(Asserts.assertEquals(list.get(3), "five"));
        System.out.println(Asserts.assertEquals(list.set(3, "six"), "five"));

        System.out.println(list);
    }
}
