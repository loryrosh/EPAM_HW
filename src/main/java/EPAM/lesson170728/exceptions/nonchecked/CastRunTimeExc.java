package EPAM.lesson170728.exceptions.nonchecked;

public class CastRunTimeExc {
    public static void main(String[] args) {
        cast();
    }

    private static void cast() {
        Object o = "hello";
        String s = (String) o; // нисходящее преобразование

        o = new StringBuilder(); // RunTime exception

        String str = castToString(o);
        System.out.println("res: " + str);
    }

    private static String castToStringWithInstanceOf(Object o) {
        return (o instanceof String) ? (String) o : "";
    }

    private static String castToString(Object o) {
        String s;
        try {
            s = (String) o;
        } catch (Exception ex) {
            s = "";
        }
        return s;
    }
}
