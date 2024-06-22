package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

class IOS extends Platform {

  @Override
  UIComponentFactory createUiComponentFactory() {
    return new IOSFactory();
  }

}
