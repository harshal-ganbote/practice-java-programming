package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class User {
  private String name;
  private String email;

  User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  @Override
  public String toString() {
    return "User { name = " + name + ", email = " + email + "}";
  }
}
