package EPAM.lesson170724.hw;

public class TakeCare {
    public static void main(String[] args) {
        System.out.println("Dog");
        Pet pet = new Dog();
        pet.play();
        pet.feed();
        pet.play();
        pet.stroke();
        pet.wash();
        pet.feed();
        pet.feed();

        System.out.println("Cat");
        pet = new Cat();
        pet.play();
        pet.feed();
        pet.feed();
        pet.wash();
        pet.stroke();
        pet.feed();

        System.out.println("Rat");
        HarmfulAnimal animal = new Rat();
        animal.scream();
        animal.scream();
        animal.entrap();
        animal.scream();
        animal.extirpate();
    }
}
