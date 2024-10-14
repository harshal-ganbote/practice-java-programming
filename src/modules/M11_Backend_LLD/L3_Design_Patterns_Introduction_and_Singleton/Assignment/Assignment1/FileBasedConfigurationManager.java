package modules.M11_Backend_LLD.L3_Design_Patterns_Introduction_and_Singleton.Assignment.Assignment1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

abstract class FileBasedConfigurationManager {
  protected final Properties properties;

  public FileBasedConfigurationManager() {
    this.properties = new Properties();
  }

  public void load(String filePath) {
    try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
      properties.load(fileInputStream);
    } catch (IOException e) {
      throw new RuntimeException("Error while loading configuration file", e);
    }
  }

  public static FileBasedConfigurationManager getInstance() {
    throw new UnsupportedOperationException("Not implemented yet");
  }

  protected static void resetInstance() {

  }

  public abstract String getConfiguration(String key);

  public abstract <T> T getConfiguration(String key, Class<T> type);

  public abstract void setConfiguration(String key, String value);

  public abstract <T> void setConfiguration(String key, T value);

  public abstract void removeConfiguration(String key);

  public abstract void clear();

  protected Properties getProperties() {
    return properties;
  }

  /**
   * Converts a string value to a specific type. Supported types are Integer,
   * Long, Float, and Double.
   *
   * @param value the string value to convert
   * @param type  the target type
   * @param <T>   the target type
   * @return the converted value
   * @throws UnsupportedOperationException if the type is not supported
   */
  protected <T> T convert(String value, Class<T> type) {
    System.out.println("Converting " + value + " to " + type.getSimpleName());
    if (Integer.class.equals(type)) {
      return type.cast(Integer.valueOf(value));
    } else if (Long.class.equals(type)) {
      return type.cast(Long.valueOf(value));
    } else if (Float.class.equals(type)) {
      return type.cast(Float.valueOf(value));
    } else if (Double.class.equals(type)) {
      return type.cast(Double.valueOf(value));
    } else {
      throw new UnsupportedOperationException("Invalid type: " + type.getSimpleName());
    }
  }
}
