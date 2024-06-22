package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.Button;

class Main {
  public static void main(String[] args) {
    System.out.println();
    Platform platform1 = new Android();
    UIComponentFactory uiComponentFactory = platform1.createUiComponentFactory();
    Button button = uiComponentFactory.createButton();
    button.displayButtonType();

    Platform platform2 = new IOS();
    UIComponentFactory uiComponentFactory2 = platform2.createUiComponentFactory();
    Button button2 = uiComponentFactory2.createButton();
    button2.displayButtonType();

    System.out.println();
  }
}
