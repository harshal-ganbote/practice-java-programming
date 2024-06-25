package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment1;

class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
  static private FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl;

  private FileBasedConfigurationManagerImpl () {
    super();
  }

  @Override
  public String getConfiguration(String key) {
    return getProperties().getProperty(key, null);
  }

  @Override
  public <T> T getConfiguration(String key, Class<T> type) {
    String value = getProperties().getProperty(key);
    if (value == null) {
      return null;
    }
    return convert(value, type);
  }

  @Override
  public void setConfiguration(String key, String value) {
    getProperties().setProperty(key, value);
  }

  @Override
  public <T> void setConfiguration(String key, T value) {
    getProperties().setProperty(key, value.toString());
  }

  @Override
  public void removeConfiguration(String key) {
    getProperties().remove(key);
  }

  @Override
  public void clear() {
    getProperties().clear();
  }

  public static FileBasedConfigurationManager getInstance() {
    if (fileBasedConfigurationManagerImpl != null) {
      return fileBasedConfigurationManagerImpl;
    }
    synchronized (FileBasedConfigurationManagerImpl.class) {
      if (fileBasedConfigurationManagerImpl == null) {
        fileBasedConfigurationManagerImpl = new FileBasedConfigurationManagerImpl();
      }
    }
    return fileBasedConfigurationManagerImpl;
  }

  public static void resetInstance() {
    fileBasedConfigurationManagerImpl= null;
  }
}
