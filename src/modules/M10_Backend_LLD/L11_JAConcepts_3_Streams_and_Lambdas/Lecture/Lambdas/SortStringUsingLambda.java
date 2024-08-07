package modules.M10_Backend_LLD.L11_JAConcepts_3_Streams_and_Lambdas.Lecture.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class SortStringUsingLambda {

  public static void main(String[] args) {
    List<String> birds = new ArrayList<>();
    birds.add("Myna");
    birds.add("Bulbul");
    birds.add("Drongo");
    birds.add("Sunbird");
    birds.add("Purple Rumped Sunbird");

    birds.sort((b1, b2) -> b1.length() - b2.length());
    birds.sort((b1, b2) -> b2.compareTo(b1));
    System.out.println(birds);
  }
}
