package foundations.section8.practices;

import java.util.ArrayList;
import java.util.List;

public class Temperature {

    private static double temperature = Double.MIN_VALUE;
    private static List<Double> temperatures = new ArrayList<>();

    protected static void showTemperatureSeason() {
        double max = temperatures.get(0), sum = 0;

        for (Double temp : temperatures) {
            sum += temp;

            if (temp > max) {
                max = temp;
            }
        }
        System.out.printf("Hottest Temp: %.1f\nAverage Temp: %.1f", max, sum / temperatures.size());
    }

    // Below getters and setters

    protected static double getTemperature() {
        return temperature;
    }

    protected static void setTemperature(double temperature) {
        if (temperature > -50 && temperature < 50) {
            Temperature.temperature = temperature;

            if (temperature >= 0) {
                temperatures.add(temperature);
            }

        } else {
            System.out.println("Incorrect temperature input");
        }
    }
}
