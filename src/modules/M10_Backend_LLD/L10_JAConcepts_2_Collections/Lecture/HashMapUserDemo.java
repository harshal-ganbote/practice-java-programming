package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapUserDemo {

  public static void main(String[] args) {
    HashMap<User, String> map = new LinkedHashMap<>();

    User user1 = new User("harshobaMau", "harshoba@gmail.com");
    User user2 = new User("MauHarshoba", "Mua@gmail");
    User user3 = new User("Deepmeena", "deepak@gmail.com");

    map.put(user1, "instructor");
    map.put(user2, "student");
    map.put(user3, "TA");

    Iterator<Map.Entry<User, String>> it = map.entrySet().iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
