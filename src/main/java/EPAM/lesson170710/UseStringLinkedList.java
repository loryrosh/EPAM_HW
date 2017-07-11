package EPAM.lesson170710;

public class UseStringLinkedList {
    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println(list);

        System.out.println(list.remove("two"));
        System.out.println(list);

        list.add("One");
        System.out.println(list);

        System.out.println(list.remove("One"));
        System.out.println(list);

        list.add("OneOne");
        System.out.println(list);
        System.out.println(list.size);
        System.out.println(list.remove(0));
        System.out.println(list);

        list.add("OneOne1");
        System.out.println(list);
        System.out.println(list.remove(list.size - 1));
        System.out.println(list);
    }
}
