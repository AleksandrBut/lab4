import java.io.Serializable;

public class Forecast implements Serializable {

    private int temperature;
    private String description;
    private int pressure;
    private String windDirection;

    public Forecast(int temperature, String description, int pressure, String windDirection) {

        this.temperature = temperature;
        this.description = description;
        this.pressure = pressure;
        this.windDirection = windDirection;

    }

    public void printForecast() {

        System.out.println("-----------------------------------------\n" + description);
        System.out.println("Температура: " + temperature + "*C");
        System.out.println("Давление: " + pressure + " мм рт. ст.");
        System.out.println("Ветер " + windDirection);

    }
}
