package streamPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " age: " + this.age;
    }
}

public class OldestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Rajul", 35);
        Person p2 = new Person("Ruchit", 37);

        List<Person> people = Arrays.asList(p1,p2);
        Person person = people.stream().max(Comparator.comparing(pe -> pe.age)).get();
        System.out.println(person.toString());
    }
}