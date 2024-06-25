package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.Lecture.BirdV2;

class Pigeon extends FlyingBird {
  @Override
  void fly() {
    System.out.println("Pigeon is Flying.");
  }

  @Override
  void makeSound() {
    System.out.println("Pigeon makes sound.");
  }
}
