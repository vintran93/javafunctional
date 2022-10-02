package finalsection;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        // Primitives
        Integer number = null;
//        int counter = 0; should not be outside

        // not allowed to have primitives in the <>
        BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
            int counter = 0; // acceptable inside this function; only visible inside this function and not outside
            // logic
            if (name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("Only name provided: " + "Alex", null));
        System.out.println(upperCaseName.apply("Age provided: " + "Alex", 29));

    }



}