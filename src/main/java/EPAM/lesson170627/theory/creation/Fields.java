package EPAM.lesson170627.theory.creation;

public class Fields {

    // вложенный static-класс, чтобы избежать конфликта имен классов внутри пакета
    static class A {
        final int i = 10;
        final long timestamp = System.currentTimeMillis();
    }

    static class B {
        int i; // значение 0 - поля имеют значения по умолчанию
        //final int j; // значение не определено

        public void doIt(int x) { // значение x пока не определено

        }

        public void printIt(String x) { // значение x пока не определено

        }

        public void printState() { // значение x пока не определено
            int x;
            // System.out.println(x); // ошибка, так как локальная переменная не имеет значения по умолчанию

            int y = 0;
            System.out.println(y); // ошибки нет - провели инициализацию
        }
    }
}
