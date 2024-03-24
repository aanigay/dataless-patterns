package patterns.creational.abstractfactory;

public class PrivateTransportFactory implements TransportFactory {
    @Override
    public LandTransport createLandTransport() {
        return new Car();
    }

    @Override
    public AirTransport createAirTransport() {
        return new Helicopter();
    }
}
