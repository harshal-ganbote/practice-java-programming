package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.BirdV1;

class Peacock extends Bird {
  @Override
  void makeSound() {
    System.out.println("peacock makes sound.");
  }

  @Override
  void fly() {
    System.out.println("peacock is flying.");
  }
}
