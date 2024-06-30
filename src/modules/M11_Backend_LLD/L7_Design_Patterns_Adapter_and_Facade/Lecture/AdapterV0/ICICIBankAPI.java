package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV0;

class ICICIBankAPI {

  int balanceCheck() {
    return 100;
  }

  void transfer() {
    System.out.println("Money is transferred using ICICIBank");
  }
}
