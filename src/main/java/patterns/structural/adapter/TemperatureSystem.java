package patterns.structural.adapter;

public class TemperatureSystem {
    public void displayCelsiusTemperature(Sensor sensor) {
        System.out.println(sensor.getCelsiusTemperature());
    }
}
