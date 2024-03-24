package patterns.behavioral.strategy;

public class MultiplicationStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
