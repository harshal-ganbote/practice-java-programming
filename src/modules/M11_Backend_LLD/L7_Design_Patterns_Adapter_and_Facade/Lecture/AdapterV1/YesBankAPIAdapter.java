package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class YesBankAPIAdapter implements BankAPI {
  YesBankAPI yesBankAPI = new YesBankAPI();

  @Override
  public int checkBalance() {
    return yesBankAPI.getBalance();
  }

  @Override
  public boolean transferMoney(int from, int to, int amount) {
    yesBankAPI.setFrom(from);
    yesBankAPI.setTo(to);
    yesBankAPI.setAmount(amount);
    yesBankAPI.moneyTransfer();
    return true;
  }
}
