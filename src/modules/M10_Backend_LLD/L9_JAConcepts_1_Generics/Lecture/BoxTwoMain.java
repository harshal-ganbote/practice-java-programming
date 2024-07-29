package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

import java.util.ArrayList;
import java.util.List;

public class BoxTwoMain {

  public static void main(String[] args) {
    BoxTwo<Integer, Integer> box1 = new BoxTwo<Integer, Integer>(10, 20);
    BoxTwo<Integer, User> box2 = new BoxTwo<Integer, User>(10, new User("Harshal", "harshal70007@gmail.com"));
    BoxTwo<String, ArrayList<Integer>> box3 = new BoxTwo<String, ArrayList<Integer>>("MyArray",
        new ArrayList<>(List.of(10, 20, 30)));

    System.out.println(box1);
    System.out.println(box2);
    System.out.println(box3);
  }
}
