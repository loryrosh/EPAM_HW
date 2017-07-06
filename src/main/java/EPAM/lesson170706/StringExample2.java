package EPAM.lesson170706;

public class StringExample2 {
    public static void main(String[] args) {
        String s = new String();

        System.out.println(s.length());

        String s0 = "hello"; // литерал (создается на момент компиляции)
        String s1 = new String("hello"); // новый объект с содержимым таким же, как и s0
        String s2 = new String(s0); // ссылка на готовый объект
        String s3 = new String(s1); // ссылка на готовый объект

        System.out.println(System.identityHashCode(s0)); // все это разные объекты
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s0 == s1); // все адреса разные
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s0);

        System.out.println(s0.equals(s1));  // все содержимое этих объектов одинаковое
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s0));

        String s4 = s0;

        System.out.println(s4 == s0);
        System.out.println(s4.equals(s0));

        String s5 = "hello";
        System.out.println(s5 == s0);

        System.out.println("\u29BB"); // печать символа Unicode из таблицы https://unicode-table.com
    }
}
