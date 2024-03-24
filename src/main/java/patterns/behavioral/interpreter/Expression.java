package patterns.behavioral.interpreter;

import java.util.Stack;

public interface Expression {
    void interpret(Context context);
}

