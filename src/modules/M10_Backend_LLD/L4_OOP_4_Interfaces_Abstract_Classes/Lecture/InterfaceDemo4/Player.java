package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Lecture.InterfaceDemo4;

public class Player implements Comparable<Player> {
  private int rank;
  private String name;
  private int age;

  Player(String name, int rank, int age) {
    this.rank = rank;
    this.name = name;
    this.age = age;
  }

  @Override
  public int compareTo(Player other) {
    return this.rank - other.rank;
  }

  @Override
  public String toString() {
    return "Player{" +
        "rank=" + rank +
        ", name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
