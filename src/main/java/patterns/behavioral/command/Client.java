package patterns.behavioral.command;

// Client
public class Client {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        RemoteControl remoteControl = new RemoteControl();

        // Set commands
        Command increaseCommand = new IncreaseTemperatureCommand(thermostat, 30);
        Command decreaseCommand = new DecreaseTemperatureCommand(thermostat, 10);

        // Execute commands
        remoteControl.setCommand(increaseCommand);
        remoteControl.executeCommand();

        remoteControl.setCommand(decreaseCommand);
        remoteControl.executeCommand();
    }
}
