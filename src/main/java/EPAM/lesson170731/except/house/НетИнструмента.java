package EPAM.lesson170731.except.house;

public class НетИнструмента extends RuntimeException {
    public НетИнструмента(Exception cause) {
        super(cause);
    }
}
