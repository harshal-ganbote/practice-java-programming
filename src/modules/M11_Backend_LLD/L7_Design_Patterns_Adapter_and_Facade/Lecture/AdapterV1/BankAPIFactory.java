package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

class BankAPIFactory {

  public static BankAPI getBankAPIByName(String bankAPIName) {

    if (bankAPIName.equals("YesBank")) {
      return new YesBankAPIAdapter();
    } else if (bankAPIName.equals("ICICIBank")) {
      return new ICICIBankAPIAdapter();
    }

    return null;
  }
}
