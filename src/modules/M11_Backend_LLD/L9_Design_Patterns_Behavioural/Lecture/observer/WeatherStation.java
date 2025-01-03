package modules.M11_Backend_LLD.L9_Design_Patterns_Behavioural.Lecture.observer;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    currentConditionsDisplay.changeSubject(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    System.out.println();
    weatherData.setMeasurements(82, 70, 29.2f);
    System.out.println();
    weatherData.setMeasurements(78, 90, 29.2f);
    System.out.println();

    currentConditionsDisplay.unSubscribeToUpdates();
    weatherData.setMeasurements(62, 90, 28.1f);
    System.out.println();
    currentConditionsDisplay.subscribeToUpdates();
    weatherData.setMeasurements(99, 90, 28.1f);
    System.out.println();
  }
}
