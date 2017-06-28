package EPAM.lesson170627.theory.primitives;

public class Examples {
    public static void main(String[] args) {
        // стандартные переменные
        // пришли из Фортрана (все, что начиналось на них, было ЦЕЛОЧИСЛЕННЫМ)
        int i, j, k, l, m, n; // 32 бита (1 - на знак и 31 - на значение)

        long lo; // 64 бита
        short sh; // 16 бита

        byte b; // 8 бита (1 бит под знак: от -128 до 127)

        float f; // 32 бита
        double d; // 64 бита

        boolean bul; // теоритически 1 бит (но зависит от реализации, длины машинного слова); true/false

        char c; // 16 бит

        String s; // ссылочная переменная - адрес в памяти. 4 байта (но зависит от режима работы JVM - 32 или 64)

        Examples e = new Examples();
        System.out.println(e);

        // изменили значение переменной
        c = 'b';

        e = new Examples();
        System.out.println(e);
    }
}
