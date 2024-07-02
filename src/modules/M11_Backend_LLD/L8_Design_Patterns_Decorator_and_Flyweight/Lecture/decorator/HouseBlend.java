package modules.M11_Backend_LLD.L8_Design_Patterns_Decorator_and_Flyweight.Lecture.decorator;

public class HouseBlend implements Beverage {

  @Override
  public int getCost() {
    return 75;
  }

  @Override
  public void getDesc() {
    System.out.println("House Blend : " + getCost());
  }

}
