package patterns.behavioral.interpreter;

// Non-terminal Expression: AddExpression
public class AddExpression implements Expression {
    private final Expression left;
    private final Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public void interpret(Context context) {
        left.interpret(context);
        int oldOutput = context.getOutput();
        right.interpret(context);
        int newOutput = context.getOutput() + oldOutput;
        context.setOutput(newOutput);
    }
}
