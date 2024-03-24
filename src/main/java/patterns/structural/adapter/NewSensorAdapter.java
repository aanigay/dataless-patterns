package patterns.structural.adapter;

public class NewSensorAdapter extends Sensor {
    private final NewSensor newSensor;
    public NewSensorAdapter(NewSensor newSensor) {
        this.newSensor = newSensor;
    }

    @Override
    public double getCelsiusTemperature() {
        return (newSensor.getFahrenheitTemperature() + 32) * 5 / 9;
    }
}
