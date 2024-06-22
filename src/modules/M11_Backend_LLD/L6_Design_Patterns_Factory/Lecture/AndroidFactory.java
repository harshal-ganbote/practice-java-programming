package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.AndroidButton;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.Button;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.DropDown.AndroidDropDown;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.DropDown.DropDown;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Menu.AndroidMenu;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Menu.Menu;

class AndroidFactory extends UIComponentFactory {

  @Override
  Button createButton() {
    return new AndroidButton();
  }

  @Override
  Menu createMenu() {
    return new AndroidMenu();
  }

  @Override
  DropDown createDropDown() {
    return new AndroidDropDown();
  }

}
