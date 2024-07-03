package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.strategy;

public class GoogleMaps {

  void findPath(String source, String dest, TravelMode travelMode) {
    PathCalculatorStrategyFactory.getPathCalculatorStrategyByMode(travelMode).findPath(source, dest);
  }
}
