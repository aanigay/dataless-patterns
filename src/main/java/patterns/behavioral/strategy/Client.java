package patterns.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Calculator calculator;

        // Addition
        calculator = new Calculator(new AdditionStrategy());
        System.out.println("Addition: " + calculator.executeStrategy(5, 3));

        // Subtraction
        calculator = new Calculator(new SubtractionStrategy());
        System.out.println("Subtraction: " + calculator.executeStrategy(5, 3));

        // Multiplication
        calculator = new Calculator(new MultiplicationStrategy());
        System.out.println("Multiplication: " + calculator.executeStrategy(5, 3));
    }
}
