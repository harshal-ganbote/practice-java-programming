package modules.M11_Backend_LLD.L1_SOLID_1_SRP_and_OCP.Lecture.BirdV2;

abstract class Bird {
  String name;
  String color;
  int wings;
  String type;
  float weight;

  public void eat() {
    System.out.println("bird is eating.");
  }

  abstract void makeSound();
}
