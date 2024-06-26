package modules.M11_Backend_LLD.L6_Design_Patterns_Factory.Lecture;

class PlatformFactory {

  static Platform getPlatformByName(String platformName) {
    if (platformName.equals("Android")) {
      return new Android();
    } else if (platformName.equals("IOS")) {
      return new IOS();
    }

    return null;
  }
}
