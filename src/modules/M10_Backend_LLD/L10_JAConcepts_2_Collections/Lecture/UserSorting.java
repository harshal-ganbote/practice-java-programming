package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserSorting {

  public static void main(String[] args) {
    User user1 = new User("Harshal", "harshal@gmail.com");
    User user2 = new User("Shraddha", "shraddha@gmail.com");
    User user3 = new User("Meena", "meena@gmail.com");

    List<User> list = new ArrayList<>();
    list.add(user1);
    list.add(user2);
    list.add(user3);

    Collections.sort(list, (o1, o2) -> o1.getEmail().compareTo(o2.getEmail()));
    System.out.println(list);
  }
}
