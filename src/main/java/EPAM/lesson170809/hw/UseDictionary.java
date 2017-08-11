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

        Dictionary d1 = Dictionary.createInstance(1000);
        System.out.println("");

        Dictionary d2 = Dictionary.createInstance(10000);
        System.out.println("");

        Dictionary d3 = Dictionary.createInstance(100000);

        Dictionary<String, Integer> d4 = new Dictionary<>();
        d4.put("Dad", 10);
        d4.put("Mum", 20);
        d4.put("Son", 10);
        System.out.println(d4.toString());
    }
}
