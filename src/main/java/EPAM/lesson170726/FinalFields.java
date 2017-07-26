package EPAM.lesson170726;

public class FinalFields {
    public static void main(String[] args) {
        AA a = new AA(); // на этом этапе все final-переменные уже будут проинициализированы
    }
}

class AA {
    final int x = 10;
    final int y;
    final int z;

    {
        y = 20;
        // System.out.println(z); error - not initialized yet
    }

    public AA() {
        z = 30;
    }
}

class BB {
    //final int k; // можно ли инициализировать k в классе-потомке?
}

class C extends B {
    {
        //k = 10;
        // срабатывает только после того, как отработал конструктор класса BB
        // конструктор должен гарантировать, что все класса поля имеют значения после завершения работы конструктора
    }
}
