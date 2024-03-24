package patterns.behavioral.command;

// Concrete command
public class DecreaseTemperatureCommand extends Command {
    public DecreaseTemperatureCommand(Thermostat thermostat, int targetTemperature) {
        super(thermostat, targetTemperature);
    }

    @Override
    void execute() {
        while (thermostat.getTemperature() > targetTemperature) {
            thermostat.decreaseTemperature();
        }
    }
}
