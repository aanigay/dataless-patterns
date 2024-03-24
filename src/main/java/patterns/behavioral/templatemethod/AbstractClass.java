package patterns.behavioral.templatemethod;

public abstract class AbstractClass {
    // Template for algorithm
    public void executeAlgorithm() {
        step1();
        step2();
        step3();
    }

    protected abstract void step1();
    protected abstract void step2();
    protected abstract void step3();
}
