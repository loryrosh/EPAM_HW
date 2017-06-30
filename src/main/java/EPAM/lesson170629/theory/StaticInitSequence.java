package EPAM.lesson170629.theory;

public class StaticInitSequence {
    public static void main(String[] args) throws InterruptedException {
        // не рекомендуется запись в одну строчку
        int j = 0, k, l = 10;

        System.out.println("start");

        // это НЕ первое обращение к классу - константы проставляются
        // на момент компиляции
        System.out.println(A.MAX);

        // НЕ первое обращение к классу (просто объявляем тип переменной)
        A a;

        Thread.sleep(3000);

        // ПЕРВОЕ ОБРАЩЕНИЕ к классу
        System.out.println(A.init());

        Thread.sleep(3000);
        System.out.println("create");
        a = new A();
    }
}
