package EPAM.lesson170707;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String s = "hello";

        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('l')); // стравнение с символом - позиция слева
        System.out.println(s.indexOf("kk")); // стравнение со строкой

        System.out.println(s.lastIndexOf('l')); // позиция справа
        System.out.println(s.substring(2, 4));

        System.out.println(s.toUpperCase());
        System.out.println(s.toUpperCase(new Locale("ru")));

        System.out.println("Hello".equalsIgnoreCase(s));

        System.out.println(s.contains("el")); // поиск подстроки
        System.out.println(s.replace("el", "UL"));

        String s2 = "Hello!   ";
        System.out.println(s2.length());
        System.out.println(s2.trim());

        
    }
}
