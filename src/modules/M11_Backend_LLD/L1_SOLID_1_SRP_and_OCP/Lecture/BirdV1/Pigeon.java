package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.Lecture.BirdV1;

class Pigeon extends Bird {
  @Override
  void makeSound() {
    System.out.println("sparrow makes sound");
  }

  @Override
  void fly() {
    System.out.println("sparrow is flying.");
  }
}
