package EPAM.lesson170629.theory.classtructure;

public class UseA {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();

        // вызов статического метода класса
        System.out.println(A.compare(a1, a2));

        // вызов метода экземпляра
        System.out.println(a1.compare(a2));
    }
}
