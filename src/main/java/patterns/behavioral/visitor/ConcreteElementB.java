package patterns.behavioral.visitor;

public class ConcreteElementB implements Element {
    public void DoSomething() {
        System.out.println("B. Do something");
    }
    public void DoSomethingDifferent() {
        System.out.println("B. Do something different");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
