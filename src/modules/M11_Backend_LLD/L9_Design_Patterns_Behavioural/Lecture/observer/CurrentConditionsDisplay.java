package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degree and " + humidity + "% humidity");
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;

    display();
  }

  public void subscribeToUpdates() {
    this.weatherData.registerObserver(this);
  }

  public void unSubscribeToUpdates() {
    this.weatherData.removeObserver(this);
  }

  public void changeSubject(Subject newSubject) {
    this.weatherData = newSubject;
  }

}
