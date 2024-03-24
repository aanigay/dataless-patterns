package patterns.creational.abstractfactory;

public class Airliner implements AirTransport {
    @Override
    public void fly() {
        System.out.println("Airliner flying");
    }
}
