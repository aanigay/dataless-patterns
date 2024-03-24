package patterns.creational.prototype;

public class Transport implements Cloneable {
    private String type;
    private int wheels;
    private double weight;

    public Transport(String type, int wheels, double weight) {
        this.type = type;
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public Cloneable clone() {
        return new Transport(this.type, this.wheels, this.weight);
    }
}
