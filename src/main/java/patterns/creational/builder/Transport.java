package patterns.creational.builder;

public class Transport {
    private String type;
    private int wheels;

    public void setType(String type) {
        this.type = type;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return this.type;
    }

    public int getWheels() {
        return this.wheels;
    }
}

interface TransportBuilder {
    void buildType();
    void buildWheels();
    Transport getTransport();
}

class CarBuilder implements TransportBuilder {
    private Transport Transport;

    public CarBuilder() {
        this.Transport = new Transport();
    }

    @Override
    public void buildType() {
        Transport.setType("Car");
    }

    @Override
    public void buildWheels() {
        Transport.setWheels(4);
    }

    @Override
    public Transport getTransport() {
        return Transport;
    }
}

class BikeBuilder implements TransportBuilder {
    private Transport Transport;

    public BikeBuilder() {
        this.Transport = new Transport();
    }

    @Override
    public void buildType() {
        Transport.setType("Bike");
    }

    @Override
    public void buildWheels() {
        Transport.setWheels(2);
    }

    @Override
    public Transport getTransport() {
        return Transport;
    }
}

class Director {
    private TransportBuilder TransportBuilder;

    public void setTransportBuilder(TransportBuilder TransportBuilder) {
        this.TransportBuilder = TransportBuilder;
    }

    public Transport getTransport() {
        return TransportBuilder.getTransport();
    }

    public void constructTransport() {
        TransportBuilder.buildType();
        TransportBuilder.buildWheels();
    }
}