package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class FastTagRecharge {
  int recharge(BankAPI bankAPI, int amount) {
    if (bankAPI.checkBalance() > amount) {
      System.out.println("Recharge is successfully done");
      return 1;
    }

    return -1;
  }
}
