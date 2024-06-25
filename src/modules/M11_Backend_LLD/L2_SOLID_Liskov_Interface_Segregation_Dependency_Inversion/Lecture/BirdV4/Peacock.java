package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.Lecture.BirdV4;

class Peacock extends Bird implements Flyable {

  FlyBehaviour flyBehaviour;

  Peacock() {
    this.flyBehaviour = new FlyLow();
  }

  Peacock(FlyBehaviour flyBehaviour) {
    this.flyBehaviour = flyBehaviour;
  }

  @Override
  void makeSound() {
    System.out.println("Peacock makes sound.");
  }

  @Override
  public void fly() {
    System.out.println("Peacock is flying.");
    this.flyBehaviour.makeFly();
  }
}
