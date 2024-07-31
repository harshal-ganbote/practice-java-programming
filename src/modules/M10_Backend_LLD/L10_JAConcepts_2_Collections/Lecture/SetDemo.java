package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

  public static void main(String[] args) {
    Set<Integer> s = new HashSet<>();
    s.add(30);
    s.add(20);
    s.add(50);
    s.add(20);

    Set<Integer> s2 = new TreeSet<>();
    s2.addAll(s);
    System.out.println(s2);
  }
}
