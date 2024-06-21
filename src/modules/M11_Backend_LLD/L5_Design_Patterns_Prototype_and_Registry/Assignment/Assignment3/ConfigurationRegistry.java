package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment3;

import java.util.HashMap;

class ConfigurationRegistry implements ConfigurationPrototypeRegistry {
  private HashMap<ConfigurationType, Configuration> configurationHashMap = new HashMap<>();

  @Override
  public void addPrototype(Configuration configuration) {
    this.configurationHashMap.put(configuration.getType(), configuration);
  }

  @Override
  public Configuration getPrototype(ConfigurationType type) {
    return this.configurationHashMap.getOrDefault(type, null);
  }

  @Override
  public Configuration clone(ConfigurationType type) {
    Configuration configuration = this.configurationHashMap.getOrDefault(type, null);

    if (configuration == null) {
      return null;
    }

    return configuration.cloneObject();
  }
}
