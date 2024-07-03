package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.strategy;

public class CarPathCalcStrategy implements PathCalculatorStrategy {

  @Override
  public void findPath(String source, String dest) {
    System.out.println("Car Path is being calculated");
  }

}
