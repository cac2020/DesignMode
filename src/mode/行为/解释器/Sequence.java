package mode.行为.解释器;

import java.util.List;

public class Sequence implements Expression {
    private List<Expression> expressions; // 表达式列表

    public Sequence(List<Expression> expressions) {
        this.expressions = expressions;
    }
    @Override
    public void interpret() {
        expressions.forEach(exp -> exp.interpret());
    }

}
