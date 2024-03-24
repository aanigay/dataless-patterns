package patterns.behavioral.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ConcreteElementA element) {
        element.DoSomething();
        element.DoSomethingDifferent();
    }

    @Override
    public void visit(ConcreteElementB element) {
        element.DoSomething();
        element.DoSomethingDifferent();
    }
}
