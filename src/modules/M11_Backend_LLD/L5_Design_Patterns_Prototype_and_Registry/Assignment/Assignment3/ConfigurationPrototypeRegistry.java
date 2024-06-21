package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment3;

interface ConfigurationPrototypeRegistry {
  void addPrototype(Configuration configuration);
  Configuration getPrototype(ConfigurationType type);
  Configuration clone(ConfigurationType type);
}
