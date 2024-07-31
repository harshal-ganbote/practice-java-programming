package modules.M10_Backend_LLD.L11_JAConcepts_3_Streams_and_Lambdas;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class StreamDemo {
  public static void main(String[] args) {
    List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

    // What does the following code snippet do?
    Map<Integer, List<String>> groupedByLength = fruits.stream()
        .collect(Collectors.groupingBy(String::length));

    Set<String> uniqueFruits = new HashSet<>(fruits);

    IntFunction<Integer> square = x -> x * x;
    System.out.println(square.apply(5));

    BinaryOperator<Integer> addition = (x, y) -> x + y;
    System.out.println(addition.apply(10, 20));

    Function<Integer, Integer> increment = x -> x + 1;
    System.out.println(increment.apply(7));

    System.out.println("Result: " + uniqueFruits);
  }
}
