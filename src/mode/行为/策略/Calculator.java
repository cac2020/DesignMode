package mode.行为.策略;

/**
 * 计算器
 */
public class Calculator {
    //算法策略接口
    private Strategy strategy;
    //注入算法策略
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 返回具体策略的运算结果
     * @param a
     * @param b
     * @return
     */
    public int getResult(int a, int b){
        return strategy.calculate(a,b);
    }
}
