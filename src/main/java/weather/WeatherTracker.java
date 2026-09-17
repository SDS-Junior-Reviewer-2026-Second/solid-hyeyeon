package weather;

public class WeatherTracker {
    String currentConditions;
    Notifier notifier;
    Phone phone;
    Email email;

    public WeatherTracker() {
//        phone = new Phone();
//        email = new Email();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription.equals("rainy")) {
            System.out.print(getWeatherAlert(new Phone(), weatherDescription));
        }
        if (weatherDescription.equals("sunny")) {
            System.out.print(getWeatherAlert(new Email(), weatherDescription));
        }
    }

    public String getWeatherAlert(Notifier notifier, String weatherDesciption){
        return notifier.generateWeatherAlert(weatherDesciption);
    }
}