package EPAM.lesson170724.nested;

public class Outer {
    int state = 0;

    public void change() {
        state++;
    }
}

// если бы Helper был внутренним классом, поле outer было бы создано автоматически
class Helper {
    private Outer outer;

    public Helper(Outer outer) {
        this.outer = outer;
    }

    void process() {
        outer.state = 30;
        outer.change();
        outer.change();
    }
}
