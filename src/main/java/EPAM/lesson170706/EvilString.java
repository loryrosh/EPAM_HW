package EPAM.lesson170706;

public class EvilString {
    final char[] value;
    private int offset;
    private int length;

    public EvilString(String valueSource) {
        this.value = valueSource.toCharArray();
        this.length = value.length;
    }

    private EvilString(char[] value, int offset, int length) {
        this.value = value;
        this.offset = offset;
        this.length = length;
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public EvilString subString(int begin, int end) {
        // TODO пропустили многочисленные guard conditions

        return new EvilString(value, begin, end - begin);
    }

    public static void main(String[] args) {
        String s = new String(new char[1_000_000]); // _ - можно использовать для разделения больших чисел

        EvilString mStr = new EvilString(s);
        EvilString word = mStr.subString(0, 10); // здесь остается ссылка на миллионный массив данных

    }
}
