package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class NumberBox<T extends Number> {
  T number;

  NumberBox(T number) {
    this.number = number;
  }

  public T getNumber() {
    return this.number;
  }

  @Override
  public String toString() {
    return "NumberBox { number = " + number + "}";
  }
}
