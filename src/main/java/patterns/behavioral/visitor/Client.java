package patterns.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.addElement(new ConcreteElementA());
        processor.addElement(new ConcreteElementB());

        Visitor areaCalculator = new ConcreteVisitor();
        processor.processElements(areaCalculator);
    }
}
