import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        Forecast forecast = new Forecast(23, "Сегодня солнечная" +
                " и ясная погода. Осадков не предвидется", 750, "северо-западный");

        // Сохранение состояния объекта forecast

        Gson gson = new Gson();
        String gsonString = gson.toJson(forecast);

        // Считывание состояния объекта из файла и его отображение

        Forecast forecast2 = gson.fromJson(gsonString, Forecast.class);
        forecast2.printForecast();
    }
}
