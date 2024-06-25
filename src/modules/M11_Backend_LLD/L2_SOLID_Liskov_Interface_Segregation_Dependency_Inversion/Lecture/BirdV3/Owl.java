package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.Lecture.BirdV3;

public class Owl extends Bird implements Flyable {
  @Override
  void makeSound() {
    System.out.println("Owl makes sound.");
  }

  @Override
  public void fly() {
    System.out.println("Owl is flying.");
  }
}
