package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class PhonePeLoan {
  boolean checkEligibility(BankAPI bankAPI) {
    return bankAPI.checkBalance() > 1000;
  }
}
