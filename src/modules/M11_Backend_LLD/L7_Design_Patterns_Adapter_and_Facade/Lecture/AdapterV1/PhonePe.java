package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class PhonePe {
  BankAPI bankAPI;
  FastTagRecharge fastTagRecharge = new FastTagRecharge();
  PhonePeLoan phonePeLoan = new PhonePeLoan();

  public void setBankAPI(BankAPI bankAPI) {
    this.bankAPI = bankAPI;
  }

  boolean doFastTagRecharge(int amount) {
    return fastTagRecharge.recharge(bankAPI, 50) > 0;
  }

  boolean availLoan() {
    if (!phonePeLoan.checkEligibility(bankAPI)) {
      System.out.println("You are not eligible");
      return false;
    } else {
      System.out.println("Loan is granted");
    }
    return true;
  }

}
