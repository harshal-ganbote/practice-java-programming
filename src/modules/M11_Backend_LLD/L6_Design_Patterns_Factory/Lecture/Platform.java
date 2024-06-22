package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

abstract class Platform {
  abstract UIComponentFactory createUiComponentFactory();

  void setTheme() {
    System.out.println("setting up theme");
  }
}
