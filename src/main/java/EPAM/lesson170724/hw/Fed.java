package EPAM.lesson170724.hw;

public class Fed implements HarmfulBrain {
    HarmfulAnimal animal = null;

    public Fed(HarmfulAnimal animal) {
        this.animal = animal;
    }

    @Override
    public void scream() {
        if (animal instanceof Rat) {
            ((Rat) animal).squeak();
            ((Rat) animal).tryToEscape();
        }
        System.out.println("_______");
    }

    @Override
    public void entrap() {
        if (animal instanceof Rat) {
            ((Rat) animal).squeak();
            ((Rat) animal).tryToEscape();
        }
        System.out.println("_______");
    }

    @Override
    public void extirpate() {
        if (animal instanceof Rat) {
            ((Rat) animal).squeak();
            ((Rat) animal).tryToEscape();
            ((Rat) animal).bite();
            ((Rat) animal).die();
        }
        System.out.println("_______");
    }
}
