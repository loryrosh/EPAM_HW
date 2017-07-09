package EPAM.lesson170707.hw;

import EPAM.mytestframework.Asserts;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String s = "  Hello    ";
        String s2 = "Hello";
        String s3 = "  Hello";
        String s4 = "Hello   ";
        String s5 = "H el lo";
        String s6 = "";

        System.out.println(Asserts.assertEquals(trim(s6), ""));
        System.out.println(Asserts.assertEquals(trim(s2), s2));
        System.out.println(Asserts.assertEquals(trim(s3), s2));
        System.out.println(Asserts.assertEquals(trim(s5), s5));
        System.out.println(Asserts.assertEquals(trim(s), s2));
        System.out.println(Asserts.assertEquals(trim(s4), s2));

        System.out.println(Asserts.assertEquals(replace("Hello", "lo", ""), "Hello".replace("lo", "")));
        System.out.println(Asserts.assertEquals(replace("Hellolo", "lo", ""), "Hellolo".replace("lo", "")));
        System.out.println(Asserts.assertEquals(replace("Hellolodgdfg  lo sdfl lo", "lo", "--"),
                "Hellolodgdfg  lo sdfl lo".replace("lo", "--")));
        System.out.println(Asserts.assertEquals(replace("Hellosdfsflo   ", "lo", ""), "Hellosdfsflo   ".replace("lo", "")));
        System.out.println(Asserts.assertEquals(replace("asd aaa u", "a", "-"), "asd aaa u".replace("a", "-")));
    }


    private static String trim(String str) {
        if (str == null || str.length() == 0)
            return str;

        int start = 0;
        while (str.charAt(start) == ' ') {
            start++;
        }

        int end = str.length() - 1;
        while (str.charAt(end) == ' ') {
            end--;
        }

        return str.substring(start, end + 1);
    }

    private static String replace(String str, String toRep, String rep) {
        if (str == null || str.length() == 0 || "".equals(toRep))
            return str;

        String res = "";
        int start = 0;

        int ind = str.indexOf(toRep);
        while (ind >= 0) {
            res += str.substring(start, ind) + rep;
            start = ind + toRep.length();

            ind = str.indexOf(toRep, start);
        }

        if (start != str.length())
            res += str.substring(start, str.length());

        return res;
    }
}
