package patterns.creational.factorymethod;

public class ConcreteCreatorB extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductB();
    }
}
