package patterns.creational.abstractfactory;

public class Helicopter implements AirTransport {
    @Override
    public void fly() {
        System.out.println("Helicopter flying");
    }
}
