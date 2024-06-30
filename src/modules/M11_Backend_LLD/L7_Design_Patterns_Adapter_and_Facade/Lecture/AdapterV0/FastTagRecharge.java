package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV0;

class FastTagRecharge {
  int recharge(YesBankAPI yesBankAPI, int amount) {
    if (yesBankAPI.getBalance() > amount) {
      System.out.println("Recharge is successfully done");
      return 1;
    }

    return -1;
  }
}
