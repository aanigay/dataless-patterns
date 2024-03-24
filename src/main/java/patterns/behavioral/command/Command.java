package patterns.behavioral.command;

public abstract class Command {
    protected Thermostat thermostat;
    protected int targetTemperature;

    public Command(Thermostat thermostat, int targetTemperature) {
        this.thermostat = thermostat;
        this.targetTemperature = targetTemperature;
    }

    abstract void execute();
}

