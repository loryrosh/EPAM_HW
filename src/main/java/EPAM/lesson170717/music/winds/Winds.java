package EPAM.lesson170717.music.winds;

import EPAM.lesson170717.music.Instruments;

public abstract class Winds extends Instruments {
    @Override
    public void makeSound() {
        System.out.println("\t... Ба-бах");
    }

    public void printColor() {
    }
}
