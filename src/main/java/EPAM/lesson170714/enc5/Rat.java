package EPAM.lesson170714.enc5;

public class Rat extends Rodent {
    @Override
    protected void eat() {
        System.out.println("grab-n-run");
        makeSound();
        super.makeSound();
    }

    @Override
    protected void makeSound() {
        teethClac();
    }

    private void teethClac() {
        System.out.println("clac-clac");
    }
}
