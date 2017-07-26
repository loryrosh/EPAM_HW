package EPAM.lesson170726.interfaces.special;

public class Use {
    public static void main(String[] args) {
        Special special = Special.createDefaultImpl();
        special.doSmthingExceptional();
        Special special1 = Special.createDefaultImpl();

        System.out.println(special);
        System.out.println(special1); // имя анонимного класса будет Special$1

        Special.A a = new Special.A();
    }
}
