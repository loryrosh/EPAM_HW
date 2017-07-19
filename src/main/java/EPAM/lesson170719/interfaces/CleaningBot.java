package EPAM.lesson170719.interfaces;

import java.util.Arrays;
import java.util.List;

public class CleaningBot {
    public static void main(String[] args) {
        List<Cleanable> objs =
                Arrays.asList(new Table(), new Chair(), new Violin(), new Drum());

        /* Не чистый код!! - нужен интерфейс
        for (Object obj : objs) {
            if (obj instanceof Instrument)
                ((Instrument) obj).clean();
            if (obj instanceof Furniture)
                ((Furniture) obj).clean();
        }*/

        for (Cleanable obj : objs) {
            obj.clean();
        }
    }
}
