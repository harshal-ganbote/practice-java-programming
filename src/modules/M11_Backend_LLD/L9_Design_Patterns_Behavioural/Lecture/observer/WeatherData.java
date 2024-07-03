package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
    System.out.println("New Observer is registered!");
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
    System.out.println("Observer is de-registered!");
  }

  @Override
  public void notifyObserver() {
    System.out.println("******** LET'S NOTIFY *******");
    for (Observer observer : observers) {
      observer.update(temperature, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    notifyObserver();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;

    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

}
