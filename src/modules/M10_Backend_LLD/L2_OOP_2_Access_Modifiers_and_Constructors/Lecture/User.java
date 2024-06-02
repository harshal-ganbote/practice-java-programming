package modules.M10_Backend_LLD.L2_OOP_2_Access_Modifiers_and_Constructors.Lecture;

class User {
  protected String name;
  int age;

  User() {}

  User(String name, int age) {
    System.out.println("Creating a User");
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
