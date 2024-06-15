package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.BirdV1;

class Sparrow extends Bird {


  @Override
  void makeSound() {
    System.out.println("sparrow makes sound");
  }

  @Override
  void fly() {
    System.out.println("sparrow is flying.");
  }
}
