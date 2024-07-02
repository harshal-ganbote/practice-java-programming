package modules.M11_Backend_LLD.L8_Design_Patterns_Decorator_and_Flyweight.Lecture.decorator;

public class Client {

  public static void main(String[] args) {
    Beverage beverage = new DarkRoast();
    beverage.getDesc();

    beverage = new Milk(beverage);
    beverage = new Mocha(beverage);
    beverage = new Mocha(beverage);
    beverage = new Mocha(beverage);
    beverage = new Milk(beverage);

    beverage.getDesc();
  }
}
