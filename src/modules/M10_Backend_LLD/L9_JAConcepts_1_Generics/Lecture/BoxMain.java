package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class BoxMain {

  public static void main(String[] args) {
    Box<Integer> box1 = new Box<Integer>(10, 20);
    System.out.println(box1);

    Box<String> box2 = new Box<String>("Apple", "Guava");
    System.out.println(box2);

    System.out.println(box1.x);
    System.out.println(box2.x);
  }
}
