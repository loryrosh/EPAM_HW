package EPAM.lesson170804.collections;

public class NodeInLIst {

}

class MyList<E> {
    static class Node<E> { // тип E класса не будет действовать в статическом контексте

    }

    class Node1<E> { // здесь тип E внешнего класса будет доступен

    }
}
