package patterns.behavioral.interpreter;

import java.util.Stack;

// Client
public class Client {
    public static void main(String[] args) {
        // Input: 5 + (2 + 3)
        String expression = "5 + 2";
        Context context = new Context(expression);

        // Parse and interpret the expression
        Expression parsedExpression = parseExpression(context.getInput());
        parsedExpression.interpret(context);

        // Output the result
        System.out.println("Result: " + context.getOutput());
    }

    // Method to parse the expression string and return the parsed expression
    private static Expression parseExpression(String input) {
        Stack<Expression> stack = new Stack<>();

        for (String token : input.split("\\s+")) {
            if (token.equals("+")) {
                if (stack.size() < 2) {
                    System.out.println("Invalid expression: Not enough operands for addition.");
                    return null;
                }
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new AddExpression(left, right));
            } else {
                // Assume token is a number
                stack.push(new NumberExpression(Integer.parseInt(token)));
            }
        }

        if (stack.size() != 1) {
            System.out.println("Invalid expression: Too many operands.");
            return null;
        }

        return stack.pop();
    }
}
