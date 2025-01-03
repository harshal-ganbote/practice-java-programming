package modules.M10_Backend_LLD.L10_JAConcepts_2_Collections.Lecture;

public class User {
  private String name;
  private String email;

  User(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "User [name=" + name + ", email=" + email + "]";
  }
}
