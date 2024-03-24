package patterns.behavioral.templatemethod;

public class FirstConcreteAlgorithm extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("Algorithm 1, step 1");
    }

    @Override
    protected void step2() {
        System.out.println("Algorithm 1, step 2");
    }

    @Override
    protected void step3() {
        System.out.println("Algorithm 1, step 3");
    }
}
