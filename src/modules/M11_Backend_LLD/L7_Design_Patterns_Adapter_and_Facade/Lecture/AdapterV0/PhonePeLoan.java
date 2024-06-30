package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV0;

class PhonePeLoan {

  boolean checkEligibility(YesBankAPI yesBankAPI) {
    return yesBankAPI.getBalance() > 1000;
  }

}
