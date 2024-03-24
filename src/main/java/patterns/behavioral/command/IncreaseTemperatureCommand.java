package patterns.behavioral.command;

// Concrete command
public class IncreaseTemperatureCommand extends Command {
    public IncreaseTemperatureCommand(Thermostat thermostat, int targetTemperature) {
        super(thermostat, targetTemperature);
    }

    @Override
    void execute() {
        while (thermostat.getTemperature() < targetTemperature) {
            thermostat.increaseTemperature();
        }
    }
}
