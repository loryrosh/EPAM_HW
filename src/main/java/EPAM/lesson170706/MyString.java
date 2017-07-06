package EPAM.lesson170706;

public class MyString {
    final char[] value;

    public MyString(String valueSource) {
        this.value = valueSource.toCharArray();
    }

    // метод позволяет извне изменять внутреннее поле - ПЛОХО
    public char[] toCharArray() {
        return value;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public static void main(String[] args) {
        MyString s = new MyString("hello");
        s.toCharArray()[0] = 'b'; // изменяем напрямую поле MyString

        System.out.println(s);
    }
}
