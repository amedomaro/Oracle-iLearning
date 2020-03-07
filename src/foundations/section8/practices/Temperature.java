package foundations.section8.practices;

import java.util.ArrayList;
import java.util.List;

public class Temperature {

    private double temperature;
    private static List<Double> temperatures = new ArrayList<>();

    protected Temperature(double temperature) {
        setTemperature(temperature);
    }

    public double getTemperature() {                                // Below getters and setters
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
