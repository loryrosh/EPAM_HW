package EPAM.lesson170724.nestedex;

public class Dog implements Pet {
    Brain brain = new Hungry();

    private class Hungry implements Brain {
        @Override
        public void feed() {
            bark();
            wiggle();
            eat();
            bark();
            brain = Dog.this.new Fed(); // то же, что и brain = new Fed()
        }

        @Override
        public void play() {
            bark();
            bite();
            bark();
        }
    }

    private class Fed implements Brain {
        @Override
        public void feed() {
            wiggle();
            wiggle();
        }

        @Override
        public void play() {
            bark();
            wiggle();
            jump();

            // Dog.this.brain - то же самое
            brain = new Hungry();
        }
    }

    private void jump() {
        System.out.println("jumps");
    }

    private void bite() {
        System.out.println("bites");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void wiggle() {
        System.out.println("wiggles");
    }

    private void bark() {
        System.out.println("barks");
    }

    @Override
    public void feed() {
        brain.feed();
    }

    @Override
    public void play() {
        brain.play();
    }
}
