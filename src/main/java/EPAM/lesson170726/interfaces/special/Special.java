package EPAM.lesson170726.interfaces.special;

public interface Special {
    class A {

    }

    Special special = new Special() {
        @Override
        public void doSmthingExceptional() {
            System.out.println("I am great!");
        }
    };

    static Special createDefaultImpl() {
        return special;
    }

    void doSmthingExceptional();
}
