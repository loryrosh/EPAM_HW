package EPAM.lesson170717.music.winds;

public class Woodwinds extends Winds {
    @Override
    public void makeSound() {
        System.out.println("Тук-тук");
        super.makeSound();
    }

    @Override
    public void printColor() {
        System.out.println("Color of the wood!");
    }
}
