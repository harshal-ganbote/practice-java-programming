package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Lecture;

class User {
  protected String name;
  protected String email;

  User() {
    System.out.println("Creating a User");
  }

  User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
