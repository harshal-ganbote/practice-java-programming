package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.Button;

import java.util.Scanner;

class Main {

  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println();
    String platFormName = scanner.nextLine();
    Platform platform = Platform.createPlatform(platFormName);
    // Platform platform1 = new Android();
    UIComponentFactory uiComponentFactory = platform.createUiComponentFactory();
    Button button = uiComponentFactory.createButton();
    button.displayButtonType();

    System.out.println();
  }
}
