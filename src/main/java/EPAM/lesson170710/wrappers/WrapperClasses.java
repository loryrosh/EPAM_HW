package EPAM.lesson170710.wrappers;

import java.util.Hashtable;

public class WrapperClasses {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();

        int[] a = {0, 10, 20, 30};
        System.out.println(a[1]);

        a[2] = 50;

        table.put("name1", "12312414");
        table.put("name2", "12312416");
        table.put("name3", "12312417");

        System.out.println(table);
        table.put("name3", "1217205710257");
        System.out.println(table);

        table.put(new Integer(1), "one");
        table.put(1, "one-number");
        table.put(new Integer(1000000), "million");
        System.out.println(table);
    }
}
