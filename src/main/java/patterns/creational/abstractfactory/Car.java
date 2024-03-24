package patterns.creational.abstractfactory;

public class Car implements LandTransport {
    @Override
    public void drive() {
        System.out.println("Car driving");
    }
}
