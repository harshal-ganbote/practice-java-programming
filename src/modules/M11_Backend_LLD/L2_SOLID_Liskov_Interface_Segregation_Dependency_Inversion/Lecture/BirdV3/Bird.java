package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.Lecture.BirdV3;

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
