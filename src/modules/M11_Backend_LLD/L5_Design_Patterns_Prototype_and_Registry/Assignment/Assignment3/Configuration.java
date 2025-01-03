package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment3;

class Configuration implements ClonableObject<Configuration> {
  private String themeColor;
  private Boolean autoSave;
  private String language;
  private Boolean darkMode;
  private Integer fontSize;
  private String fontFamily;
  private ConfigurationType type;

  public Configuration(String themeColor, Boolean autoSave, String language, Boolean darkMode, Integer fontSize, String fontFamily, ConfigurationType type) {
    this.themeColor = themeColor;
    this.autoSave = autoSave;
    this.language = language;
    this.darkMode = darkMode;
    this.fontSize = fontSize;
    this.fontFamily = fontFamily;
    this.type = type;
  }

  public String getThemeColor() {
    return themeColor;
  }

  public Boolean getAutoSave() {
    return autoSave;
  }

  public String getLanguage() {
    return language;
  }

  public Boolean getDarkMode() {
    return darkMode;
  }

  public Integer getFontSize() {
    return fontSize;
  }

  public String getFontFamily() {
    return fontFamily;
  }

  public ConfigurationType getType() {
    return type;
  }

  @Override
  public Configuration cloneObject() {
    return new Configuration(this.themeColor, this.autoSave, this.language,this.darkMode, this.fontSize, this.fontFamily, this.type);
  }
}
