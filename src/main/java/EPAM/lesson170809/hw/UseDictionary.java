package EPAM.lesson170809.hw;

import EPAM.lesson170809.hw.Dictionary.Pair;

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

        for (Pair pair : d) {
            System.out.println(pair.key + " " + pair.value);
        }
    }
}
