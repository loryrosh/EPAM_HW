package EPAM.lesson170731.except.house;

public class ПроблемыСТехникой extends RuntimeException {
    public ПроблемыСТехникой(Exception cause) {
        super(cause);
    }
}
