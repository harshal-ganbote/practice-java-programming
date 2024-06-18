package modules.M10_Backend_LLD.L1_OOP_1_Intro_to_LLD_and_OOP.Additional_Problems.Problem1;

class BankAccount {
  String accountNumber;
  int balance;
  double roi;

  double getSimpleInterest(int years) {
    return (this.balance * this.roi * years) / 100;
  }

  double getBalanceWithInterest(int years) {
    double simpleInterest = getSimpleInterest(years);
    return this.balance + simpleInterest;
  }
}
