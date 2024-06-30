package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

interface BankAPI {

  int checkBalance();
  boolean transferMoney(int from, int to, int amount);
}
