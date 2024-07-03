package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.strategy;

public class Client {

  public static void main(String[] args) {
    GoogleMaps googleMaps = new GoogleMaps();
    googleMaps.findPath("Mumbai", "Delhi", TravelMode.BIKE);
  }
}
