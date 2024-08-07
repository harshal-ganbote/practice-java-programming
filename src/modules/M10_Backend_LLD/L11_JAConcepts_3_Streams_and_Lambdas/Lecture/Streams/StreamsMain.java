package modules.M10_Backend_LLD.L11_JAConcepts_3_Streams_and_Lambdas.Lecture.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamsMain {

  public static void main(String[] args) {

    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("Gauva");
    fruits.add("Orange");
    fruits.add("Banana");
    fruits.add("Pear");
    fruits.add("Appricot");
    fruits.add("Grape");
    fruits.add("Pineapple");

    List<String> fruitsOutput = new ArrayList<>();
    for (String fruit : fruits) {
      if (fruit.startsWith("A")) {
        fruitsOutput.add(fruit);
      }
    }
    System.out.println(fruitsOutput);

    List<String> fruitsOutputStreams1 = fruits.stream()
            .filter(fruit -> fruit.startsWith("A"))
            .map(String::toUpperCase)
            .toList();
    System.out.println(fruitsOutputStreams1);

    List<String> fruitsOutputStreams2 = fruits.stream()
            .filter(fruit -> fruit.length() > 5).toList();
    System.out.println(fruitsOutputStreams2);

    Long count = fruits.stream().filter(fruit -> fruit.startsWith("A")).count();
    System.out.println(count);

    List<Integer> numbers = new ArrayList<>(List.of(5, 7, 10, 12, 14, 18, 21, 8, 9, 10));
    Predicate<Integer> isEven = number -> number % 2 == 0;
    numbers.stream().filter(isEven).forEach(System.out::println);

    System.out.println(isEven.test(8));

    Consumer<String> consumer = System.out::println;
    consumer.accept("Hello World!!");

    Supplier<String> supplier = () -> "Hi!";
    System.out.println(supplier.get());

    Function<String, Integer> function = String::length;
    System.out.println(function.apply("Hello"));

    System.out.println(fruits);
    System.out.println();

//    List<Integer> list = fruits.stream()
//            .filter(fruit -> )

  }
}
