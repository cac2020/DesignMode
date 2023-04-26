package mode.行为.策略;

/**
 * 策略模式让策略与系统环境彻底解耦，通过对算法策略的抽象、
 * 拆分，再拼装、接入外设，使系统行为的可塑性得到了增强。策略接
 * 口的引入也让各种策略实现彻底解放，最终实现算法分立，即插即
 * 用。
 */
public interface Strategy {
    public int calculate(int a, int b);//操作数a，被操作数b
}
