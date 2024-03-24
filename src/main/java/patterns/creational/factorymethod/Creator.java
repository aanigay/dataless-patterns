package patterns.creational.factorymethod;

// Creator abstract class
public abstract class Creator {
    abstract Product createProduct();

    void produce() {
        Product product = createProduct();
        product.produce();
    }
}
