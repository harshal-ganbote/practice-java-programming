package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.strategy;

public class WalkPathCalcStrategy implements PathCalculatorStrategy {

  @Override
  public void findPath(String source, String dest) {
    System.out.println("Walk Path is being calculated");
  }
}
