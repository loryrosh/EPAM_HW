package EPAM.lesson170726;

// pattern Factory
// https://github.com/iluwatar/java-design-patterns/tree/master/factory-method
public class ConstuctorDependencyEx {

    static Worker create() {
        // снаружи этот класс будет недоступен
        // сюда можно добавить switch-конструкции и другие анонимные классы, чтобы создавать разные объекты
        class BigTroll implements Worker {
            @Override
            public void doIt() {
                System.out.println("Won't do!");
            }
        }
        return new BigTroll();
    }

    static class B implements Worker {
        @Override
        public void doIt() {
            System.out.println("did it");
        }
    }

    static class A {
        private Worker worker;

        public A(Worker worker) {
            this.worker = worker;
        }

        public void setB(Worker worker) {
            this.worker = worker;
        }

        void change() {
            worker.doIt();
        }
    }

    public static void main(String[] args) {
        A a = new A(new B());
        a.change();

        a = new A(new B() {
            @Override
            public void doIt() {
                System.out.println("B-style");
            }
        });

        class C extends B {
            @Override
            public void doIt() {
                System.out.println("C style");
            }
        }
    }
}
