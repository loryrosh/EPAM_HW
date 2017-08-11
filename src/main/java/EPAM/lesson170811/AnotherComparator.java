package EPAM.lesson170811;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnotherComparator {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("John", "Ireland"));
        list.add(new Person("Mary", "Russia"));
        list.add(new Person("Jack", "Russia"));

        list.sort(new CompareByName());
        list.sort(new CompareByCountry());
        System.out.println(list);
    }
}

class CompareByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class CompareByCountry implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.country.compareTo(o2.country);
    }
}


class Person {
    String name;
    String country;

    public Person(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", country='" + country + '\'';
    }
}
