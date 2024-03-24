package patterns.creational.abstractfactory;

public class Bus implements LandTransport {
    @Override
    public void drive() {
        System.out.println("Bus driving");
    }
}
