package EPAM.lesson170717.music;

public abstract class Instruments {
    public abstract void makeSound();

    public boolean isReadyToPlay() {
        return true;
    }

    public boolean needsTechnicalSupport() {
        return false;
    }
}
