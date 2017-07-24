package EPAM.lesson170724.nested;

public class Use {
    public static void main(String[] args) {

        // создание экземпляра вложенного класса
        StaticExamples.X x = new StaticExamples.X();

        InnerExamples in = new InnerExamples();

        // создание нового экземпляра внутреннего класса
        InnerExamples.Processor proc = in.new Processor();
        proc.process();
    }
}
