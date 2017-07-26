package EPAM.lesson170726;

public class Hidden {
    public static void main(String[] args) {
        A a = new A();
        A.helper();
        a.change();

        A a2 = new B();
        A.helper();
        a2.change();
        B.helper();
    }
}

class A {
    public int x;
    private int y;

    static void helper() {
        System.out.println("Helper of A");
    }

    public void change() {
        System.out.println("Change of A");
    }

    protected void internal() {
    }

    private void secret() {
    }
}

class B extends A {
    public int x; // скрываем x из A

    @Override
    protected void internal() {
        super.internal();
    }

    @Override
    public void change() {
        System.out.println("Change of B");
    }

    static void helper() { // скрываем
        System.out.println("Helper of B");
    }
}
