package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {
    Map<String, Integer> menu = new HashMap<>();
    menu.put("Rajma-Rice", 120);
    menu.put("Idli", 80);
    menu.put("Dosa", 100);

    String output = menu.toString();
    System.out.println(output);
  }
}
