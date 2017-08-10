package EPAM.lesson170809.hw;

public class UseDictionary {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();
        d.put("Pete", "New York");
        d.put("John", "Boston");
        d.put("Вася", "Москва");

        System.out.println(d.get("John"));
        System.out.println(d.get("Ann"));
        System.out.println(d.get("Вася"));


        d.put("John", "St. Petersburg");
        System.out.println(d.get("John"));
        System.out.println("________");

        d.delete("John");
        System.out.println(d.toString());

        d.put("John", "Dublin");
        System.out.println(d.get("John"));
        System.out.println("________");

        System.out.println(d.toString());
        d.resize();
        System.out.println(d.toString());
    }
}
