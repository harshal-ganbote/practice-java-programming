package modules.M10_Backend_LLD.L4_OOP_4_Interfaces_Abstract_Classes.Additional_Problems.Problem3;

public class Car implements Comparable<Car> {
  int Price;
  int Speed;

  @Override
  public int compareTo(Car o) {
    return this.Price - o.Price;
  }
}
