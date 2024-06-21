package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Lecture;

class UPI extends PaymentMethod {
  public void pay(int money) {
    System.out.println("Making payment via UPI " + money);
  }
}
