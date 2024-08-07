package modules.M10_Backend_LLD.L11_JAConcepts_3_Streams_and_Lambdas.Lecture.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class SortStrings {

  public static void main(String[] args) {
    List<String> birds = new ArrayList<>();
    birds.add("Myna");
    birds.add("Bulbul");
    birds.add("Drongo");
    birds.add("Peacock");
    birds.add("Sunbird");
    birds.add("Purple Rumped Sunbird");

    birds.sort(new BirdLengthComparator());
    System.out.println(birds);
  }
}
