package EPAM.lesson170627.theory.creation;

public class SuperExample {
    static class A {
        A(int i) {
        }
    }

    static class B extends A {
        public B() {
            // конструктор без параметров в классе SuperSuperExample отсутствует
            // super();

            // обязательно нужно вызвать конструктор
            // супер-класса, т.к. в нем нет конструктора
            // по умолчанию (мы уже сделали свой конструктор в SuperSuperExample)
            super(10);
        }
    }
}
