package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.strategy;

public class BikePathCalcStrategy implements PathCalculatorStrategy {

  @Override
  public void findPath(String source, String dest) {
    System.out.println("Bike Path is being calculated");
  }
}
