package modules.M11_Backend_LLD.L2_SOLID_Liskov_Interface_Segregation_Dependency_Inversion.Lecture.BirdV4;

class FlyLow implements FlyBehaviour {
  @Override
  public void makeFly() {
    System.out.println("This Bird is flying low");
  }
}
