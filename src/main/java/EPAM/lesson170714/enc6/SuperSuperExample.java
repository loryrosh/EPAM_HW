package EPAM.lesson170714.enc6;

public class SuperSuperExample {
    static class A {
        void m() {
            System.out.println("one");
        }
    }

    static class B extends A {
        @Override
        void m() {
            System.out.println("two");
        }

        void x() {
            super.m();
        }
    }

    static class C extends B {
        @Override
        void m() {
            x();
        }
    }

    public static void main(String[] args) {
        C c = new C();
        c.m();
        A a = c;
        a.m();
    }
}
