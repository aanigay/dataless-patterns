package patterns.creational.factorymethod;

// Concrete Creators
public class ConcreteCreatorA extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
