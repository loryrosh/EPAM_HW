package EPAM.lesson170701.operations;

public class Example1 {
    public static void main(String[] args) {

        process(0); // без проверки типа в process будет Exception при преобразовании к (String)

        Object o = new String();

        process(o);
    }

    private static void process(Object o) {
        // _безопасное_ преобразование к String
        if (o instanceof String) {
            System.out.println(((String) o).length());
        }
    }
}
