package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.BirdV4;

class Penguin extends Bird {
  @Override
  void makeSound() {
    System.out.println("Penguin makes sound.");
  }
}
