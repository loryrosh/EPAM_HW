package EPAM.lesson170714.enc5;

import java.util.Arrays;
import java.util.List;

public class HomeBot {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(new Dog(), new Cat(), new Hamster());

        for (Pet pet : pets) {
            pet.feed();
        }

        Pet pet = new Dog();
        Dog dog = (Dog) pet; // нисходящее преобразование
        //Cat cat = (Cat) pet; // Class cast exception во время выполнения программы

        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
        }

        Rat r = new Rat();
        r.feed();
    }
}
