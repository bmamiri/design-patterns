package behavioral.interpreter;

import java.util.Map;

public class Plus implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public Plus(final Expression leftExpression, final Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret(Map<String, Expression> context) {
        return leftExpression.interpret(context) + rightExpression.interpret(context);
    }
}
