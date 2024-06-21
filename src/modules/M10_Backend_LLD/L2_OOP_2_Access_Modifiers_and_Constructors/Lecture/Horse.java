package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

class Horse extends Animal {

  public void speak() {
    System.out.println("Horse...Mehhh....");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
