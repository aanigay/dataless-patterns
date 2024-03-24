package patterns.behavioral.command;

// Receiver
public class Thermostat {
    private int temperature = 25; // Default value

    public void increaseTemperature() {
        temperature++;
    }

    public void decreaseTemperature() {
        temperature--;
    }

    public int getTemperature() {
        return temperature;
    }
}

