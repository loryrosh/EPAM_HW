package EPAM.lesson170627.theory.creation;

public class UseA {
    public static void main(String[] args) {
        //SuperSuperExample a = new SuperSuperExample();
        //System.out.println(a);

        B b = new B();

        C c = new C();
        c.C();

        Singleton.get().doIt();

        new Z();
        new Z();

        WholePicture.A p = new WholePicture.A();

    }
}
