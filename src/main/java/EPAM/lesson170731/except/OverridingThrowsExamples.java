package EPAM.lesson170731.except;

public class OverridingThrowsExamples {
    static class MyException extends Exception {

    }

    static class A {
        public void m() throws MyException {

        }
    }

    static class B extends A {
        @Override
        public void m() throws MyException {
            super.m();
        }
    }

    static class C extends A {
        @Override
        public void m() throws MyException {
            super.m();
        }
    }

    public static void main(String[] args) {
        A a = new C();

        try {
            a.m();
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
}
