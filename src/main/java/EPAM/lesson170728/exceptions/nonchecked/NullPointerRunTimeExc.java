package EPAM.lesson170728.exceptions.nonchecked;

// NPE - Null Pointer Exception
public class NullPointerRunTimeExc {
    public static void main(String[] args) {
        printObjectInfo("hello");

        try {
            printObjectInfo(null);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        printObjectInfo(new Object());
    }

    private static void printObjectInfo(Object o) {
        if (o == null) {
            return;
        }

        System.out.println("Class name " + o.getClass().getCanonicalName());
        System.out.println("Class name " + o.hashCode());
        System.out.println("Class name " + o.toString());
    }
}
