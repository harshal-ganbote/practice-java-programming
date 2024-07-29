package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class NumberBoxMain {

  public static void main(String[] args) {
    NumberBox<Integer> numberBox1 = new NumberBox<Integer>(10);
    System.out.println(numberBox1);

    NumberBox<Double> numberBox2 = new NumberBox<Double>(10.35);
    System.out.println(numberBox2);
  }
}
