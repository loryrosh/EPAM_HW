package EPAM.lesson170804.collections;

import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        int x = 0;
        String s = "hello";

        // массивы
        int a[] = new int[10];
        Object[] objs = new Object[0];

        // стек
        Stack<String> stack = new Stack<>();
        stack.push("one");

        // списки
        List<Number> list = Arrays.asList(1, 1.3);
        List<Number> linkedList = new LinkedList() {{ // инициализация на лету
            add(1);
            add(1.3);
        }};
        linkedList.add(1.3f);

        // Очередь
        Queue<String> queue = new ArrayDeque<>();
        PriorityQueue<Integer> que = new PriorityQueue<>();
    }
}
