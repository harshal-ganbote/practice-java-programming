package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment1;

interface UserPrototypeRegistry {
  void addPrototype(User user);
  User getPrototype(UserType type);
  User clone(UserType type);
}
