package EPAM.lesson170726.interfaces.clean;

abstract public class Pet implements Cleanable {
    @Override
    public void clean() {
        System.out.println("Clean with care");
    }

    @Override
    public void takeApart() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void combine() {
        throw new UnsupportedOperationException();
    }
}
