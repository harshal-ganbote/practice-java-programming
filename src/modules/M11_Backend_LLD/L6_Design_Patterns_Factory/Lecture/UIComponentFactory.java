package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Button.Button;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.DropDown.DropDown;
import modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture.Components.Menu.Menu;

abstract class UIComponentFactory {
  abstract Button createButton();

  abstract Menu createMenu();

  abstract DropDown createDropDown();
}
