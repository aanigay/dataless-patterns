package patterns.creational.abstractfactory;

public interface TransportFactory {
    LandTransport createLandTransport();
    AirTransport createAirTransport();
}

