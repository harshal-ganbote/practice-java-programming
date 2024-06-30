package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class ICICIBankAPI {

  int balanceCheck() {
    return 100;
  }

  boolean transfer(int to, int from, int amount) {
    System.out.println("Money is transferred using ICICIBank");
    return true;
  }

}
