package EPAM.lesson170701.operations;

public class Loops {
    public static void main(String[] args) {
        while (true) {
            if (true) {
                break;
            }
        }

        /* оператор goto зарезервирован, но не выполняется
        LOOP:
        if (true) {
            goto LOOP;
        }
        */

        int x = 0;


        for (int i = 0; i < args.length; i++) {

        }

        // эквивалентно предыдущему
        int j = 0;
        while (j < args.length) {
            j++;
        }

        int i = 0;
        do {
            if (i > 10) {
                break;
            }
            System.out.println(i);
            i++;

        } while (true);

        /*
            LOOP:
            // dp something
            if (true) goto LOOP;
         */
    }
}
