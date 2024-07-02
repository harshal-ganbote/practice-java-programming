package modules.M11_Backend_LLD.L8_Design_Patterns_Decorator_and_Flyweight.Lecture.decorator;

public class Milk implements AddOn {
  Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public int getCost() {
    return 10 + beverage.getCost();
  }

  @Override
  public void getDesc() {
    beverage.getDesc();
    System.out.println("Milk : " + getCost());
  }

}
