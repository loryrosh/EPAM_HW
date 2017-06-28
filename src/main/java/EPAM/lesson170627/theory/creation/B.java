package EPAM.lesson170627.theory.creation;

public class B extends A {
    {
        System.out.println("init B");
    }

    public B() {
        super();
        System.out.println("constructor B");
    }
}
