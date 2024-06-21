package modules.M10_Backend_LLD.L3_OOP_3_Inheritance_and_Polymorphism.Lecture;

class CreditCard extends PaymentMethod {
  @Override
  void pay(int money) {
    System.out.println("Making payment via Credit Card " + money);
  }
}
