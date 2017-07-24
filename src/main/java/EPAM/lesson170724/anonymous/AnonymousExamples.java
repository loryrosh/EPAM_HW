package EPAM.lesson170724.anonymous;

public class AnonymousExamples {

    // функциональный интерфейс
    interface Operation {
        public int apply(int a, int b);
    }

    private static class Addition implements Operation {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    }

    private static class Multiplication implements Operation {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        int res = process(10, 20);
        System.out.println(res);

        res = process(new Addition(), 10, 20);
        System.out.println(res);

        res = process(new Multiplication(), 10, 20);
        System.out.println(res);

        // анонимный класс
        Operation remainder = new Operation() {
            @Override
            public int apply(int a, int b) {
                return a % b;
            }
        };

        // простое добавление новой Operation с помощью анонимного класса
        // до Java 8 это был единственный способ
        res = process(new Operation() {
            @Override
            public int apply(int a, int b) {
                return a / b;
            }
        }, 20, 10);
        System.out.println(res);

        // Java 8 с помошью lambda-выражения
        res = process((a, b) -> a / b, 20, 10);
        System.out.println(res);

        // локальный класс
        class Subtract implements Operation {
            @Override
            public int apply(int a, int b) {
                return a - b;
            }
        }
        res = process(new Subtract(), 20, 10);
        System.out.println(res);
    }

    private static int process(int i, int j) {
        return new Addition().apply(i, j);
    }

    private static int process(Operation op, int i, int j) {
        return op.apply(i, j);
    }
}
