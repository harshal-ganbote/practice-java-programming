package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.BirdV4;

class Vulture extends Bird implements Flyable {

  FlyBehaviour flyBehaviour;

  Vulture() {
    this.flyBehaviour = new FlyHigh();
  }

  Vulture(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  @Override
  void makeSound() {
    System.out.println("Vulture makes sound.");
  }

  @Override
  public void fly() {
    System.out.println("Vulture is flying.");
    this.flyBehaviour.makeFly();
  }
}
