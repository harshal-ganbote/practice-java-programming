package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment1;

class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {
  static private FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl;

  private FileBasedConfigurationManagerImpl () {
    super();
  }

  @Override
  public String getConfiguration(String key) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    return getProperties().getProperty(key, null);
  }

  @Override
  public <T> T getConfiguration(String key, Class<T> type) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'getConfiguration'");
    String value = getProperties().getProperty(key);
    if (value == null) {
      return null;
    }
    return convert(value, type);
  }

  @Override
  public void setConfiguration(String key, String value) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    getProperties().setProperty(key, value);
  }

  @Override
  public <T> void setConfiguration(String key, T value) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'setConfiguration'");
    getProperties().setProperty(key, value.toString());
  }

  @Override
  public void removeConfiguration(String key) {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'removeConfiguration'");
    getProperties().remove(key);
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'clear'");
    getProperties().clear();
  }

  public static FileBasedConfigurationManager getInstance() {
    // TODO Auto-generated method stub
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
    // TODO Auto-generated method stub
    fileBasedConfigurationManagerImpl= null;
  }
}
