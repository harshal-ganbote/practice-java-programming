package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

  public static void printList(List<Integer> list) {
    for (int x : list) {
      System.out.println(x);
    }
  }

  public static void main(String[] args) {
    List<Integer> myList = new ArrayList<>();

    myList.add(1);
    myList.add(2);
    myList.add(3);

    List<Integer> myList2 = new LinkedList<>();
    myList2.add(11);
    myList2.add(12);
    myList2.add(13);
    myList2.addAll(myList);

    Iterator<Integer> iterator = myList2.iterator();
    while (iterator.hasNext()) {
      Integer element = iterator.next();
      System.out.println(element);
    }
  }
}
