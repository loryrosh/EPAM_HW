package EPAM.lesson170724.hw;

public class Cat implements Pet {
    Brain brain = new Fed();

    private class Hungry implements Brain {
        @Override
        public void feed() {
            chafe();
            eat();
            purr();
            purr();
            chafe();

            brain = new Fed();
            System.out.println("_______");
        }

        @Override
        public void play() {
            scratch();
            purr();
            scratch();
            flick();
            purr();
            System.out.println("_______");
        }

        @Override
        public void stroke() {
            purr();
            chafe();
            purr();
            scratch();
            System.out.println("_______");
        }

        @Override
        public void wash() {
            flick();
            meow();
            scratch();
            scratch();
            meow();
            System.out.println("_______");
        }
    }

    private class Fed implements Brain {
        @Override
        public void feed() {
            purr();
            eat();
            chafe();
            System.out.println("_______");
        }

        @Override
        public void play() {
            purr();
            jump();
            scratch();
            flick();
            jump();
            purr();

            brain = new Hungry();
            System.out.println("_______");
        }

        @Override
        public void stroke() {
            meow();
            purr();
            purr();
            chafe();
            purr();
            brain = new Hungry();
            System.out.println("_______");
        }

        @Override
        public void wash() {
            flick();
            flick();
            scratch();
            scratch();
            meow();
            brain = new Hungry();
            System.out.println("_______");
        }
    }

    private void jump() {
        System.out.println("jumps");
    }

    private void scratch() {
        System.out.println("scratches");
    }

    private void eat() {
        System.out.println("eats");
    }

    private void flick() {
        System.out.println("flicks the tail");
    }

    private void meow() {
        System.out.println("meows");
    }

    private void chafe() {
        System.out.println("chafes against legs");
    }

    private void purr() {
        System.out.println("purrs");
    }


    @Override
    public void feed() {
        brain.feed();
    }

    @Override
    public void play() {
        brain.play();
    }

    @Override
    public void stroke() {
        brain.stroke();
    }

    @Override
    public void wash() {
        brain.wash();
    }
}
