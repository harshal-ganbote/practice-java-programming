package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class BoxTwo<T, U> {
  T first;
  U second;

  BoxTwo(T first, U second) {
    this.first = first;
    this.second = second;
  }

  T getFirst() {
    return first;
  }

  U getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return "BoxTwo { first = " + first + ", second = " + second + "}";
  }
}
