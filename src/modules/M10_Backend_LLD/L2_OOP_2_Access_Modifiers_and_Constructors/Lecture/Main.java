package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

class Main {
  public static void main(String[] args) {
    //Public - The access level of a public modifier is everywhere.
    // It can be accessed from within the class,
    // outside the class,
    // within the package and outside the package

    Horse h= new Horse();
    h.setName("My Horse");
    System.out.println(h.getName());
    h.speak();
  }
}
