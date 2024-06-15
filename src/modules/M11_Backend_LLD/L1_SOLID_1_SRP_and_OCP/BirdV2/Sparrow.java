package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.BirdV2;

class Sparrow extends FlyingBird {
  @Override
  void fly() {
    System.out.println("Sparrow makes sound.");
  }

  @Override
  void makeSound() {
    System.out.println("Sparrow is flying.");
  }
}
