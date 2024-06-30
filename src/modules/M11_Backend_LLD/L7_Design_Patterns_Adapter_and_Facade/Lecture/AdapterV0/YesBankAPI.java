package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV0;


class YesBankAPI {

  int getBalance() {
    return 100;
  }

  void moneyTransfer() {
    System.out.println("Money is transferred via Yes Bank");
  }
}
