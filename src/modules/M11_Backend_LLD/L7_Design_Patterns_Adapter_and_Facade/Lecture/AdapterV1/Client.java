package modules.M11_Backend_LLD.L7_Design_Patterns_Adapter_and_Facade.Lecture.AdapterV1;

import java.util.Scanner;

class Client {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String bankAPIName = scanner.nextLine();
    BankAPI bankAPI = BankAPIFactory.getBankAPIByName(bankAPIName);
    PhonePe phonePe = new PhonePe();
    phonePe.setBankAPI(bankAPI);

    phonePe.doFastTagRecharge(20);
  }
}
