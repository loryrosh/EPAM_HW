package EPAM.lesson170717.music.winds;

public class Brass extends Winds {
    @Override
    public void makeSound() {
        System.out.printf("УУУУУ-уууууу");
        super.makeSound();
    }

    @Override
    public void printColor() {
        System.out.println("golden color!");
    }
}
