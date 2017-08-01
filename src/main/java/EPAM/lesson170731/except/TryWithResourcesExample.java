package EPAM.lesson170731.except;

public class TryWithResourcesExample {
    static class Resource implements AutoCloseable {
        public void close() {

        }

        public void use() {

        }
    }

    public static void main(String[] args) {
        Resource r = new Resource();

        try {
            r.use();
        } finally {
            r.close();
        }

        try (Resource r1 = new Resource()) { // эквивалентно предыдущей конструкции
            r1.use();
        }
    }
}
