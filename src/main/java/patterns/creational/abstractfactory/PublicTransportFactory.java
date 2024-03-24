package patterns.creational.abstractfactory;

public class PublicTransportFactory implements TransportFactory {
    @Override
    public LandTransport createLandTransport() {
        return new Bus();
    }

    @Override
    public AirTransport createAirTransport() {
        return new Airliner();
    }
}
