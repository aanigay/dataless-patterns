package patterns.behavioral.visitor;

public class ConcreteElementA implements Element {
    public void DoSomething() {
        System.out.println("A. Do something");
    }
    public void DoSomethingDifferent() {
        System.out.println("A. Do something different");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
