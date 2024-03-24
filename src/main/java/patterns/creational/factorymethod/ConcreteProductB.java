package patterns.creational.factorymethod;

public class ConcreteProductB implements Product {
    @Override
    public void produce() {
        System.out.println("Producing Product B");
    }
}
