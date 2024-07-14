package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Lecture;

class Test {
  public static void main(String[] args) {
    Student student = new Student("A", "A@gmail.com", "SQL");
    System.out.println(student);

    User user = new User("U", "U@gmail.com");
    User student1 = new Student("H", "H@gmail.com", "LLD");

    System.out.println(user);
    System.out.println(student1);

    System.out.println();

    Player player = new Player();
    System.out.println(player.computeScore());
    System.out.println(player.computeScore(10));
    System.out.println(player.computeScore(10, 8));
    System.out.println(player.computeScore("X", 10));

    // Player player1 = new Player();
    // Player player2 = new Player();
    // Player player3 = new Player();

    System.out.println("static member is class level data member");
    System.out.println(Player.count);
    System.out.println(Player.count);

    System.out.println("Math Library");
    System.out.println(Math.PI);
    System.out.println(Math.max(10, 20));

    System.out.println();
    PaymentMethod paymentMethod = getPaymentMethod();
    PaymentMethod paymentMethod1 = new CreditCard();
    PaymentMethod paymentMethod2 = new DebitCard();

    paymentMethod.pay(40);
    paymentMethod1.pay(50);
    paymentMethod2.pay(30);

  }

  public static PaymentMethod getPaymentMethod() {
    return new UPI();
  }
}
