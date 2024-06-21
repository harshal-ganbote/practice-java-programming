package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

class Animal {
  protected String name;

  public void speak() {}

  public void sleep() {
    System.out.println("Sleeping..." + this.name);
  }
}
