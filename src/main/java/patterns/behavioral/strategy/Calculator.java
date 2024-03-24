package patterns.behavioral.strategy;

public class Calculator {
    private final CalculationStrategy strategy;

    public Calculator(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.calculate(a, b);
    }
}
