package EPAM.lesson170714.enc5;

public abstract class Pet extends Mammal {
    public void feed() { // сигнал снаружи
        makeSound(); // реакция на сигнал
        eat();
        makeSound();
    }

    abstract protected void eat();
    abstract protected void makeSound();
}
