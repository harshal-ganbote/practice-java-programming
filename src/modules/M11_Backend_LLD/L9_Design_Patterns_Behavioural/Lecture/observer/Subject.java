package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.observer;

public interface Subject {
  void registerObserver(Observer observer);

  void removeObserver(Observer observer);

  void notifyObserver();
}
