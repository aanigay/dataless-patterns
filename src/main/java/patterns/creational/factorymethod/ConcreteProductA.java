package patterns.creational.factorymethod;

// Concrete Products
public class ConcreteProductA implements Product {
    @Override
    public void produce() {
        System.out.println("Producing Product A");
    }
}
