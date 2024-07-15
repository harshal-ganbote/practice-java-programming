package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Player player1 = new Player("Harshal", 5, 28);
    Player player2 = new Player("Shraddha", 3, 20);
    Player player3 = new Player("Kiran", 1, 29);

    List<Player> players = new ArrayList<>();
    players.add(player1);
    players.add(player2);
    players.add(player3);

    System.out.println(players);

    System.out.println("-------------------");

    Collections.sort(players);
    System.out.println(players);
  }
}
