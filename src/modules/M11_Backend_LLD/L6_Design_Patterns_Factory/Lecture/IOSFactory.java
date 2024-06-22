package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.Button;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.IOSButton;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.DropDown.DropDown;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.DropDown.IosDropDown;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Menu.IOSMenu;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Menu.Menu;

class IOSFactory extends UIComponentFactory {

  @Override
  Button createButton() {
    return new IOSButton();
  }

  @Override
  Menu createMenu() {
    return new IOSMenu();
  }

  @Override
  DropDown createDropDown() {
    return new IosDropDown();
  }

}
