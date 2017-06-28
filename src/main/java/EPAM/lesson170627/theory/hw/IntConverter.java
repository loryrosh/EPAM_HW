package EPAM.lesson170627.theory.hw;

public class IntConverter {

    public static String toBinaryString(int x) {
        if (x == 0)
            return "0";
        else if (x < 0) {
            x = -x;
        }

        String res = "";
        while (x > 0) {
            res = ((x % 2) == 0 ? "0" : "1") + res;
            x = x / 2;
        }
        return res;
    }

    public static String toOctalString(int x) {
        if (x == 0)
            return "0";
        else if (x < 0) {
            x = -x;
        }

        String res = "";
        while (x > 0) {
            res = (x % 8) + res;
            x = x / 8;
        }
        return res;
    }

    public static String toHexString(int x) {
        if (x == 0)
            return "0";
        else if (x < 0) {
            x = -x;
        }

        char[] vals = {'a' , 'b' , 'c' , 'd' , 'e' , 'f'};
        String res = "";
        while (x > 0) {
            int mod = x % 16;
            if (mod > 9) {
                res += vals[16 - mod - 1];
            } else
                res = mod + res;
            x = x / 16;
        }
        return res;
    }
}
