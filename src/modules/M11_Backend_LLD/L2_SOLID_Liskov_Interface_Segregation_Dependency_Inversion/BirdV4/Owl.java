package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.BirdV4;

public class Owl extends Bird implements Flyable {

  FlyBehaviour flyBehaviour;

  Owl() {
    this.flyBehaviour = new FlyLow();
  }

  Owl(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  @Override
  void makeSound() {
    System.out.println("Owl makes sound.");
  }

  @Override
  public void fly() {
    System.out.println("Owl is flying.");
    this.flyBehaviour.makeFly();
  }
}
