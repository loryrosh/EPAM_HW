package EPAM.lesson170821;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Person> staff = new ArrayList<>();

        staff.add(new Person("John", 40));
        staff.add(new Person("Mary", 10));
        staff.add(new Person("Jack", 90));
        staff.add(new Person("Ann", 80));
        staff.add(new Person("Clark", 40));
        staff.add(new Person("Ay", 10));
        staff.add(new Person("David", 20));

        staff.sort(new NameComparator());

        System.out.println(staff);

        Comparator<Person> byAge = (p1, p2) -> p1.getAge() - p2.getAge();
        staff.sort(byAge);

        // компаратор с помощью lambda
        Comparator<Person> byAge2 = Comparator.comparingInt(Person::getAge); // !!!!!
        staff.sort(byAge2);

        // сортируем сначала по возрасту, потом - по имени
        Comparator<Person> byAge3 =
                Comparator.comparingInt(Person::getAge).thenComparing(Person::getName);
        staff.sort(byAge3);

        System.out.println(staff);
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class Person {
    final String name;
    final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
