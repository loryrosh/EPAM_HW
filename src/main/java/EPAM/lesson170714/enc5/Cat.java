package EPAM.lesson170714.enc5;

public class Cat extends Pet {
    @Override
    protected void eat() {
        System.out.println("eat slowly");
    }

    @Override
    protected void makeSound() {
        System.out.println("murr");
    }
}
