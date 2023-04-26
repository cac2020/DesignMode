package mode.行为.策略;

public class Subtraction implements Strategy {
    @Override
    public int calculate(int a, int b) {
        return a - b;//做减法运算并返回结果
    }
}
