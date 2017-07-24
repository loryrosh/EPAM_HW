package EPAM.lesson170724.serialization;

public class TaggedInterfaceDemo {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();

        process(x);
        process(y);
    }

    private static void process(Object obj) {
        if (obj instanceof Tag) {
            
        }
    }
}

interface Tag {

}

class X implements Tag {

}

class Y {

}
