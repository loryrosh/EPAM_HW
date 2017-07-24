package EPAM.lesson170724.nested;

public class StaticExamples {
    static class A extends StaticExamples {
        static class B extends A {

        }
    }

    static class X {
        static int Z = 0;

        int state = 0;

        public void change() {
            state++;
        }

        // можно обращаться к полям, так как они находятся в том же классе
        public void evaluate() {
            state = 30;
            change();
            change();
        }

        static class Y {
            public void process() {
                // НЕ МОЖЕМ обращаться к полям класса X
                /*
                state = 20;
                change();
                change();
                */

                // к статическим полям обращаться можем
                Z = 50;

                // но лучше использовать полное имя класса
                StaticExamples.X.Z = 50;
            }
        }
    }
}
