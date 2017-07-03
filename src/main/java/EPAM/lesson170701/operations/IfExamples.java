package EPAM.lesson170701.operations;

public class IfExamples {
    public static void main(String[] args) {

        // "statement" - "оператор"

        // guard condition (проверка на граничные условия и обработка их в начале программы)
        if (args.length == 0) {
            System.out.println("Usage <word>");
            System.exit(0);
        } else {
            process(args[0]);
        }
    }

    private static void process(String word) {
        switch (word) {
            case "goodbye":
                System.out.println("Bye-bye");
                break;
            case "hello": // возможность задать несколько вариантов значений для одного поведения
            case "Morning":
            case "hi":
                System.out.println("To you too");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}
