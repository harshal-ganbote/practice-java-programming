package modules.M10_Backend_LLD.L9_JAConcepts_1_Generics.Lecture;

public class OrderPairMain {

  public static void main(String[] args) {
    OrderPair<Integer, String> op = new OrderPair<Integer, String>(10, "Hello");
    System.out.println(op.getKey());
    System.out.println(op.getValue());

    OrderPair<Integer, User> op2 = new OrderPair<Integer, User>(10, new User("Harshal", "harshal70007@gmail.com"));
    System.out.println(op2);

    // OrderPair op3 = new OrderPair(10, new User("Harshal",
    // "harshal70007@gmail.com"));
    // System.out.println(op3);
  }
}
