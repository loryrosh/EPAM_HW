package EPAM.lesson170714.enc5;

public class Dog extends Pet {
    @Override
    protected void eat() {
        System.out.println("eat fast and eager");
    }

    @Override
    final protected void makeSound() {
        System.out.println("bark");
    }
}
