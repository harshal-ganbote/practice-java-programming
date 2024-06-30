package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class ICICIBankAPIAdapter implements BankAPI {
  ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

  @Override
  public int checkBalance() {
    return iciciBankAPI.balanceCheck();
  }

  @Override
  public boolean transferMoney(int from, int to, int amount) {
    return iciciBankAPI.transfer(to, from, amount);
  }
}
