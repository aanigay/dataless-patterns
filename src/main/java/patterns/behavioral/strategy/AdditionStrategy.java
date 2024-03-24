package patterns.behavioral.strategy;

public class AdditionStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
