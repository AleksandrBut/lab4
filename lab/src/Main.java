import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Forecast forecast = new Forecast(23, "Сегодня солнечная" +
                " и ясная погода. Осадков не предвидется", 750, "северо-западный");

        // Сохранение состояния объекта forecast

        FileOutputStream fos = new FileOutputStream("forecastInfo");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(forecast);
        oos.flush();
        oos.close();

        // Считывание состояния объекта из файла и его отображение

        FileInputStream fis = new FileInputStream("forecastInfo");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Forecast newForecast = (Forecast) ois.readObject();
        newForecast.printForecast();

        ois.close();
    }
}
