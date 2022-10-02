package streams;
import imperative.main;
import java.util.List;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import static streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Vincent", MALE),
                new Person("Anne", FEMALE),
                new Person("LUCY", FEMALE),
                new Person("JOSEPH", MALE),
                new Person("NADINE", FEMALE)
//                new Person("BOB", PREFER_NOT_TO_SAY)
        );

//        Set<Gender> genders = people.stream()
//                .map(person -> person.gender)
//                .collect(Collectors.toSet());
//
//        System.out.println(genders);
//        Function<Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = x -> System.out.println(x);
//
//        people.stream()
//                .map(person -> person.name)
//                .mapToInt(String::length)
////                .collect(Collectors.toSet())
//                .forEach(System.out::println);
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

//        boolean containsOnlyFemales  = people.stream()
//                  .allMatch(personPredicate);

//        boolean containsOnlyFemales  = people.stream()
//                .anyMatch(personPredicate);

        boolean containsOnlyFemales  = people.stream()
                .noneMatch(personPredicate);

        System.out.println(containsOnlyFemales);

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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
