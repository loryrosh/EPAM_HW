package EPAM.lesson170724.hw;

public class Hungry implements HarmfulBrain {
    HarmfulAnimal animal = null;

    public Hungry(HarmfulAnimal animal) {
        this.animal = animal;
    }

    @Override
    public void scream() {
        if (animal instanceof Rat) {
            ((Rat) animal).tryToEscape();
        }
        System.out.println("_______");
    }

    @Override
    public void entrap() {
        if (animal instanceof Rat) {
            ((Rat) animal).eat();
            ((Rat) animal).squeak();
            ((Rat) animal).bite();
            ((Rat) animal).tryToEscape();
        }
        System.out.println("_______");
    }

    @Override
    public void extirpate() {
        if (animal instanceof Rat) {
            ((Rat) animal).squeak();
            ((Rat) animal).bite();
            ((Rat) animal).die();
        }
        System.out.println("_______");
    }
}
