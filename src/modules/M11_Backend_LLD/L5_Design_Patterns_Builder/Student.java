package modules.M11_Backend_LLD.L5_Design_Patterns_Builder;

class Student {
  int rollNo;
  String name;
  int age;
  int marks;
  String batch;

  private Student(Builder builder) {
    this.rollNo = builder.rollNo;
    this.age = builder.age;
    this.name = builder.name;
    this.marks = builder.marks;
    this.batch = builder.batch;
  }

  public static Builder getBuilder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "Student{" +
            "rollNo=" + rollNo +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", marks=" + marks +
            ", batch='" + batch + '\'' +
            '}';
  }

  static class Builder {
    int rollNo;
    String name;
    int age;
    int marks;
    String batch;

    public Builder setRollNo(int rollNo) {
      this.rollNo = rollNo;
      return this;
    }

    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    public Builder setAge(int age) {
      this.age = age;
      return this;
    }

    public Builder setMarks(int marks) {
      this.marks = marks;
      return this;
    }

    public Builder setBatch(String batch) {
      this.batch = batch;
      return this;
    }

    Student build() {

      if (this.age < 25) {
        throw new RuntimeException();
      }

      return new Student(this);
    }
  }
}
