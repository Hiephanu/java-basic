package org.example.lambda;

import org.example.finalPackage.In;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        Function<String, Integer> convertToInt = (str) -> {
            str.trim();
            str.substring(2,3);
            return   str.length()-1+2;
        };
        System.out.println(convertToInt.apply("hiep"));

        Predicate<Integer> predicate = (num) -> num > 2;
        System.out.println(predicate.test(4));
    }
}
