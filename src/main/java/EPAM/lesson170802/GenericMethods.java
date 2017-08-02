package EPAM.lesson170802;

public class GenericMethods {
    public static void main(String[] args) {
        String modified = X.<String>modify("one"); // !!!!!
    }
}

class X<T> {
    public static <M> M modify(M m) {
        return m;
    }

    // это ДРУГОЕ T по сравнению с "class X<T>"
    // при этом приоритет будет у <T> данного метода (T класса будет "скрыто")
    public <T> void m(T t) {

    }
}
