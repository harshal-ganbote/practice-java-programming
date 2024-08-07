package modules.M10_Backend_LLD.L11_JAConcepts_3_Streams_and_Lambdas.Lecture.Lambdas;

import java.util.Comparator;

public class BirdLengthComparator implements Comparator<String> {

  @Override
  public int compare(String b1, String b2) {
    return b1.length() - b2.length();
  }
}
