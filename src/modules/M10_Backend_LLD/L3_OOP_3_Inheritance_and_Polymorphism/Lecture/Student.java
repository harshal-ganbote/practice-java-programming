package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Lecture;

class Student extends User {
  String batchName;

  Student() {
    System.out.println("Creating a Student");
  }

  Student(String name, String email, String batchName) {
    super(name, email);
    this.batchName = batchName;
  }

  public void fun() {
    System.out.println("Let's have fun!");
  }

  @Override
  public String toString() {
    return "Student{" +
            "batchName='" + batchName + '\'' +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
