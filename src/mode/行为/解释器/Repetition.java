package mode.行为.解释器;

public class Repetition implements Expression {
    private int loopCount;// 循环次数
    private Expression loopBodySequence;// 循环体内的子表达式序列

    public Repetition(Expression loopBodySequence, int loopCount) {
        this.loopBodySequence = loopBodySequence;
        this.loopCount = loopCount;
    }
    @Override
    public void interpret() {
        while (loopCount > 0) {
            loopBodySequence.interpret();
            loopCount--;
        }
    }

}
