package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Lecture;

class Student implements Prototype<Student> {
  int id;
  String name;
  String batch;
  String type;

  Student() {
    // db call to get the details of the student
    // fill in the data here
  }

  Student(Student other) {
    this.id = other.id;
    this.name = other.name;
    this.batch = other.batch;
    this.type = other.type;
  }

  @Override
  public Student copy() {
    return new Student(this);
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", batch='" + batch + '\'' +
            ", type='" + type + '\'' +
            '}';
  }
}
