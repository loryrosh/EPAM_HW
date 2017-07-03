package EPAM.lesson170701.operations;

public class SwitchExample {
    private static final int LOAD = 0;
    private static final int SAVE = 1;
    private static final int UPDATE = 2;
    private static final int DELETE = 3;

    public static void main(String[] args) {
        process(10, LOAD);
    }

    private static void process(int i, int optCode) {
        switch (optCode) {
            case LOAD:
                break;
            case SAVE:
                break;
            case UPDATE:
                break;
            case DELETE:
                break;
            default:
                System.out.println("Unknown code");
                break;
        }
    }
}
