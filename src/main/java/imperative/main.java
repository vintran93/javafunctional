package imperative;

import java.util.List;
import java.util.ArrayList;

import static imperative.main.Gender.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Vincent", MALE),
            new Person("Anne", FEMALE),
            new Person("LUCY", FEMALE),
            new Person("JOSEPH", MALE),
            new Person("NADINE", FEMALE)
        );

        System.out.println("// imperative approach");

        // imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("// declarative approach");
        // Declarative approach; streams w/ collections
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // or
        // predicate accepts a person and then returns true or false
//        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
//
//        List<Person> females2 = people.stream()
//                .filter(personPredicate)
//                .collect(Collectors.toList());
//        females2.forEach(System.out::println);
    }
    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
