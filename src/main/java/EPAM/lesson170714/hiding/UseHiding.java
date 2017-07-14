package EPAM.lesson170714.hiding;

public class UseHiding {
    public static void main(String[] args) {
        First.X();
        Second.X();

        First f = new Second();
        f.X(); // статическое связывание ; не наследование - метод X() в классе Second не переопределяется!
        First.X(); // так правильнее
    }
}
