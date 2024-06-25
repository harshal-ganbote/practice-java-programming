package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Lecture;

class IntelligentStudent extends Student {
  int iq;

  IntelligentStudent() {

  }

  IntelligentStudent(IntelligentStudent copy) {
    super(copy);
    this.iq = copy.iq;
  }

  @Override
  public Student copy() {
    return new IntelligentStudent(this);
  }

  @Override
  public String toString() {
    return "IntelligentStudent{" +
            "iq=" + iq +
            ", id=" + id +
            ", name='" + name + '\'' +
            ", batch='" + batch + '\'' +
            ", type='" + type + '\'' +
            '}';
  }
}
