package EPAM.lesson170830;

import EPAM.lesson170828.concurrency.Utils;
import EPAM.lesson170830.ThreadStopAndRaceCondition.Modifier;

public class ThreadStopExample {
    public static void main(String[] args) {
        System.out.println("start");
        Model model = new Model();

        Modifier task = new Modifier(model);
        Thread t = new Thread(task);
        t.start();

        Utils.pause(500);
        // deprecated - "убивает" поток мгновенно, не ждет завершения критических секций
        // t.stop();

        model.check();
        System.out.println("finish");
    }
}
