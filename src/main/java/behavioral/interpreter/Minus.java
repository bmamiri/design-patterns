package behavioral.interpreter;

import java.util.Map;

public class Minus implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Minus(final Expression leftExpression, final Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return leftExpression.interpret(context) - rightExpression.interpret(context);
    }
}
