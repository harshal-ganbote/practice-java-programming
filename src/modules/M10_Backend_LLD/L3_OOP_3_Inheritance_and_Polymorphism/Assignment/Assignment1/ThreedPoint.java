package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Assignment.Assignment1;

class ThreedPoint extends Point {
  private int z;

  public void display() {
    System.out.println("[" + this.x + ", " + this.y + ", " + this.z + "]");
  }
}
