package EPAM.lesson170701.operations;

public class SwitchProblems {
    public static void main(String[] args) {
        m("hi", "bye");
    }

    private static void m(String first, String last) {
        final String middle = "guess";

        switch (first) {
            case "Test":
                break;
            case middle: // переменная должна быть final и сразу проинициализирована
                break;
        }
    }
}
