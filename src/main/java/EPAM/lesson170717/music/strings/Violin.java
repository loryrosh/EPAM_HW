package EPAM.lesson170717.music.strings;

public class Violin extends Strings {
    @Override
    public void makeSound() {
        System.out.print("...ииииии\t");
        super.makeSound();
    }
}
