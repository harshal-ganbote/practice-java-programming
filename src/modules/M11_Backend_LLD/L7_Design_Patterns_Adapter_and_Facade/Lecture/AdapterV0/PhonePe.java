package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV0;

class PhonePe {
  YesBankAPI yesBankAPI = new YesBankAPI();
  FastTagRecharge fastTagRecharge = new FastTagRecharge();
  PhonePeLoan phonePeLoan = new PhonePeLoan();

  boolean doFastTagRecharge(int amount) {
    return fastTagRecharge.recharge(yesBankAPI, amount) > 0;
  }

  boolean availLoan() {
    if (phonePeLoan.checkEligibility(yesBankAPI)) {
      System.out.println("You are not eligible");
      return false;
    }

    System.out.println("Loan is granted");
    return true;
  }
}
