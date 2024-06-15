package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.BirdV3;

class Peacock extends Bird implements Flyable {
  @Override
  void makeSound() {
    System.out.println("Peacock makes sound.");
  }

  @Override
  public void fly() {
    System.out.println("Peacock is flying.");
  }
}
