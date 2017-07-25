package EPAM.lesson170724.hw;

public class Rat implements HarmfulAnimal {
    HarmfulBrain brain = new Fed(this);

    public void bite() {
        System.out.println("bites");
    }

    public void eat() {
        System.out.println("eats");
    }

    public void tryToEscape() {
        System.out.println("tries to escape");
    }

    public void squeak() {
        System.out.println("squeaks");
    }

    public void die() {
        System.out.println("becomes dead");
    }

    @Override
    public void entrap() {
        brain.entrap();
        brain = new Fed(this);
    }

    @Override
    public void scream() {
        brain.scream();
        brain = new Hungry(this);
    }

    @Override
    public void extirpate() {
        brain.extirpate();
    }
}
