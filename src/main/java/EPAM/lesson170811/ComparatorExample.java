package EPAM.lesson170811;

import java.util.*;

public class ComparatorExample {
    public static void main(String[] args) {
        List<B> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new B());
        }
        System.out.println(list);
        Collections.sort(list, new ComparatorB());
        System.out.println(list);


        Collections.sort(list, new ComparatorB().reversed()); // обращаем порядок сортировки при создании ComparatorB
        Comparator<B> comp = new ComparatorB().reversed(); // сохраняем ссылку на объект обратной сортировки
    }
}

class ComparatorB implements Comparator<B> {
    @Override
    public int compare(B o1, B o2) {
        return o1.x - o2.x;
    }
}

class B {
    static Random r = new Random();
    int x = r.nextInt(100);

    @Override
    public String toString() {
        return Integer.toString(x);
    }
}
