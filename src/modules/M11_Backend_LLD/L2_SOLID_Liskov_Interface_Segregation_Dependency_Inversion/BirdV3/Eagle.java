package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.BirdV3;

public class Eagle extends Bird implements Flyable {
  @Override
  void makeSound() {
    System.out.println("Eagle makes sound.");
  }

  @Override
  public void fly() {
    System.out.println("Eagle is flying.");
  }
}
