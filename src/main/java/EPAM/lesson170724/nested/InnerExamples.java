package EPAM.lesson170724.nested;

public class InnerExamples {
    int state = 0;

    public void change() {
        state++;
    }

    class Processor {
        public void process() {
            // неявно здесь присутствует ссылка на внешний класс InnerExamples.this.state
            state = 20;

            // InnerExamples.this.change()
            change();
            change();
            System.out.println(this);
            System.out.println(InnerExamples.this);
        }
    }

    @Override
    public String toString() {
        return "current state = " + state;
    }
}
