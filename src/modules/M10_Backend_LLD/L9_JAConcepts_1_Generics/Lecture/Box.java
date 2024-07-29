package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class Box<T> {
  T x;
  T y;

  Box(T x, T y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "Box { x = " + x + ", y = " + y + "}";
  }
}
