package modules.M11_Backend_LLD.L5_Design_Patterns_Prototype_and_Registry.Assignment.Assignment1;

import java.util.HashMap;

class UserRegistry implements UserPrototypeRegistry {
  private final HashMap<UserType, User> userHashMap = new HashMap<>();

  @Override
  public void addPrototype(User user) {
    userHashMap.put(user.getType(), user);
  }

  @Override
  public User getPrototype(UserType type) {
    return userHashMap.getOrDefault(type, null);
  }

  @Override
  public User clone(UserType type) {
    User user = userHashMap.getOrDefault(type, null);

    if (user == null) {
      return null;
    }

    return user.cloneObject();
  }
}
